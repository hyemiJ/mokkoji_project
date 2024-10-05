package com.example.backend.repository.myPage;

import java.util.List;

import com.example.backend.entity.myPage.Cart;

public interface CartDSLRepository {
	List<Cart> findByExcludingSpecificCart(String userId, long productId, String optionContent, String packagingOptionContent);
}
