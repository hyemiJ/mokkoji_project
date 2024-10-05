package com.example.backend.service.goods;

import com.example.backend.domain.PageRequestDTO;
import com.example.backend.domain.PageResultDTO;
import com.example.backend.domain.ProductDetailDTO;
import com.example.backend.domain.ProductsDTO;
import com.example.backend.entity.goods.Products;
import com.example.backend.pageTest.Criteria;

import java.util.List;

public interface ProductsService {

	List<Products> findAll();
	
	List<ProductsDTO> findList();
	
	
	List<ProductsDTO> findTop4ByOrderByCountDescNative(Long id);
	
	List<Products> findAllProducts(Criteria cri);
	
	PageResultDTO<ProductsDTO, Products> findByCategoryId(PageRequestDTO requestDTO);

	PageResultDTO<ProductsDTO, Products> findPageAll(PageRequestDTO requestDTO);
	
	//카테고리 , 이름 검색
	PageResultDTO<ProductsDTO, Products> findByCategoryIdAndNameContaining(PageRequestDTO requestDTO);
	
	//이름 검색
	PageResultDTO<ProductsDTO, Products> findByNameContaining(PageRequestDTO requestDTO);
	
	
	ProductDetailDTO findDetailinfo(Long id);
	
	//int countByCategoryId(String CategoryId);
	
	//int countByAll();
	
	Products findById(Long id);
	
	ProductsDTO findDto(Long id);
	//ProductsDTO findByJoinOne(Long id);
	
	void save(Products item);
	
	void deleteById(Long id);
	

}
