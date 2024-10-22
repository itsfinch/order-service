package com.amazon.shoppingcart.model;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShoppingCartResponse {
	
	private Long userId;
	private Long cartId;
	private Integer totalItems;
	private Double totalCost;
	private List<Product> products;
	
}
