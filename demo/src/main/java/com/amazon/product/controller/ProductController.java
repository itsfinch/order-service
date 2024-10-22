package com.amazon.product.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.product.entity.Product;
import com.amazon.product.service.ProductService;


@RestController
@RequestMapping("/products")
public class ProductController {
	
	private ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> productList){
		return productService.addProducts(productList);
	}
	
	@GetMapping("/getProducts")
	public List<Product> getProducts() {
		return productService.getProducts();
	}
	
	@GetMapping("/getProducts/{productIdsList}")
	public List<Product> getProductsById(@PathVariable List<Long> productIdsList){
		return productService.getProductsById(productIdsList);
	}
	

}
