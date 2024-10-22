package com.amazon.shoppingcart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amazon.shoppingcart.entity.CartEntity;

@Repository
public interface CartRepository extends JpaRepository<CartEntity, Long>{

	List<CartEntity> findByUserId(Long userId);

}
