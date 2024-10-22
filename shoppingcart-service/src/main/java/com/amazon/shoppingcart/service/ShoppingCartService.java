package com.amazon.shoppingcart.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.amazon.shoppingcart.entity.CartEntity;
import com.amazon.shoppingcart.model.Product;
import com.amazon.shoppingcart.model.ShoppingCartRequest;
import com.amazon.shoppingcart.model.ShoppingCartResponse;
import com.amazon.shoppingcart.repository.CartRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ShoppingCartService {
	
	@Autowired
    @Qualifier("webclient")
    private WebClient.Builder webBuilder;
	
	@Autowired
	private CartRepository cartRepository;
	
	public ShoppingCartResponse processAddRequest(Long userId, List<ShoppingCartRequest> shoppingCartRequestList) {
		
		ObjectMapper objMapper = new ObjectMapper();
		//call product - service
		String productServiceUrl = "http://localhost:9001/products/getProducts/" + shoppingCartRequestList.stream().map(e -> String.valueOf(e.getProductId())).collect(Collectors.joining(","));
        
		String responseBody = webBuilder.build()
                .get()
                .uri(productServiceUrl)
                .retrieve()
                .bodyToMono(String.class)  // Retrieve the raw response as a string
                .block();

System.out.println(responseBody);
//		Product product = webBuilder.build()
//                .get()
//                .uri(productServiceUrl)
//                .retrieve()
//                .bodyToMono(Product.class)
//                .block();
//
//System.out.println("Product: " + product);
//System.out.println("Product ID: " + product.getProductId());
		
		List<Product> productServiceList = webBuilder.build()
                .get()
                .uri(productServiceUrl)
                .retrieve()
                .bodyToFlux(Product.class)
                .collectList()
                .block();
        
        
		// calculate total cost
		final Double[] totalCost = {0.0};
		productServiceList.forEach(psl ->{
			shoppingCartRequestList.forEach(scr ->{
//				System.out.println(psl.getProductId() + scr.getProductId());
				if(psl.getProductId() != scr.getProductId()){
				psl.setQuantity(scr.getQuantity());
				totalCost[0] = totalCost[0] + (psl.getAmount() * scr.getQuantity());
			}
			});
		});
		//create cart Entity
		CartEntity cartEntity = null;
		try {
			cartEntity = CartEntity.builder()
					.userId(userId)
					.cartId((long) (Math.random() * Math.pow(10, 10)))
					.totalItems(productServiceList.size())
					.totalCost(totalCost[0])
					.products(objMapper.writeValueAsString(productServiceList))
					.build();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
		//save cart Entity
		cartRepository.save(cartEntity);
		
		//create api response
		ShoppingCartResponse shoppingCartResponse = ShoppingCartResponse.builder()
				.cartId(cartEntity.getCartId())
				.userId(cartEntity.getUserId())
				.totalItems(cartEntity.getTotalItems())
				.totalCost(cartEntity.getTotalCost())
				.products(productServiceList)
				.build();
		
		return shoppingCartResponse;
	}

	public List<ShoppingCartResponse> getShoppingCart(Long userId) {
		
		ObjectMapper mapper = new ObjectMapper();
		List<CartEntity> cartEntities = cartRepository.findByUserId(userId);
		List<ShoppingCartResponse> cartResponse = cartEntities.stream()
				.map(ce ->{
					try {
						return ShoppingCartResponse.builder()
								.cartId(ce.getCartId())
								.userId(ce.getUserId())
								.totalItems(ce.getTotalItems())
								.totalCost(ce.getTotalCost())
								.products(mapper.readValue(ce.getProducts(), List.class))
								.build();
					} catch (JsonProcessingException e) {
						throw new RuntimeException(e);
					}
				}).collect(Collectors.toList());
		
		return cartResponse;
	}

}
