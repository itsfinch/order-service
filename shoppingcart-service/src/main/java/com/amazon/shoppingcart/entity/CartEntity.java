package com.amazon.shoppingcart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "SHOPPING_CART")
public class CartEntity {
	
	@Id
	private Long userId;
	private Long cartId;
	private Integer totalItems;
	private Double totalCost;
	private String products;
		

}
