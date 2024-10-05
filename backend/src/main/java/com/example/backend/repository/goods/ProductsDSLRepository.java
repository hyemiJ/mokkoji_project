package com.example.backend.repository.goods;

import com.example.backend.domain.ProductsDTO;
import com.example.backend.entity.goods.Products;

import java.util.List;

public interface ProductsDSLRepository {
	
	List<ProductsDTO> findByJoinList();
	
	ProductsDTO findByJoinOne(Long id);
	
	List<ProductsDTO> recommendList(Long id);
	
	ProductsDTO entityToDto(Products items);
}
