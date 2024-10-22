package com.amazon.shoppingcart.controller;

import org.springframework.web.bind.annotation.RestController;

import com.amazon.shoppingcart.model.ShoppingCartRequest;
import com.amazon.shoppingcart.model.ShoppingCartResponse;
import com.amazon.shoppingcart.service.ShoppingCartService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/shoppingcart")
public class ShoppingCartController {
	
	@Autowired
	private ShoppingCartService shoppingCartService;
	
	@PostMapping("/{userId}/products")
	public ResponseEntity addProductsTocart(
			@PathVariable Long userId,
			@RequestBody List<ShoppingCartRequest> reqProductList) {
		
		ShoppingCartResponse response= shoppingCartService.processAddRequest(userId, reqProductList);
		return new ResponseEntity(response,HttpStatus.CREATED);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity getShoppingCart(@PathVariable Long userId) {
		return ResponseEntity.ok(shoppingCartService.getShoppingCart(userId));
	}
	
	
}
