package com.example.backend.repository.goods;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.entity.goods.ProductImages;
import com.example.backend.entity.goods.ProductImagesId;

import java.util.List;

public interface ProductsImagesRepository extends JpaRepository<ProductImages, ProductImagesId>{

	public List<ProductImages> findByProductIdAndType(Long productId, String type);
}
