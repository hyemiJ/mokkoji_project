package com.example.backend.service.goods;

import java.util.List;

import com.example.backend.entity.goods.ProductOptions;
import com.example.backend.entity.goods.ProductOptionsId;

public interface ProductoptionsService {
	List<ProductOptions> findAll();

	List<ProductOptions> findByProductId(Long id);

	ProductOptions findById(ProductOptionsId id);

	void save(ProductOptions entity);

	void deleteById(ProductOptionsId id);

}
