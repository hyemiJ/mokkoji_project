package com.example.backend.service.goods;

import java.util.List;

import com.example.backend.entity.goods.ProductImages;
import com.example.backend.entity.goods.ProductImagesId;

public interface ProductImageService {
	List<ProductImages> findAll();

	List<ProductImages> findByProductIdAndType(Long productId, String type);

	ProductImages findById(ProductImagesId id);

	void save(ProductImages options);

	void deleteById(ProductImagesId id);
}
