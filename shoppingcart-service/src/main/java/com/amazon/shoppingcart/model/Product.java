package com.amazon.shoppingcart.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
	
	@JsonProperty("productId")
	private Long productId;
	private String productName;
	private Integer quantity;
	private Double amount;

}
