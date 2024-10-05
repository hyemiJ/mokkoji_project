package com.example.backend.repository.goods;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.entity.goods.ProductOptions;
import com.example.backend.entity.goods.ProductOptionsId;

import java.util.List;

public interface ProductOptionsRepository extends JpaRepository<ProductOptions, ProductOptionsId>{

	List<ProductOptions> findByProductId(Long product_id);
}
