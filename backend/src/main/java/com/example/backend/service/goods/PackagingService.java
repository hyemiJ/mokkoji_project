package com.example.backend.service.goods;

import java.util.List;

import com.example.backend.entity.goods.Packaging;

public interface PackagingService {
	List<Packaging> findAll();

	Packaging findById(String packagingContent);

	void save(Packaging entity);

	void deleteById(String packagingContent);
}
