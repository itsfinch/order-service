package com.amazon.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.product.entity.Product;
import com.amazon.product.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> addProducts(List<Product> productList) {
		return productRepository.saveAll(productList);
	}

	public List<Product> getProducts() {
		
		return productRepository.findAll();
	}

	public List<Product> getProductsById(List<Long> productIdsList) {

		return productRepository.findAllById(productIdsList);
	}

}
