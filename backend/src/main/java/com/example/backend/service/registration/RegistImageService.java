package com.example.backend.service.registration;

import java.util.List;

import com.example.backend.entity.registration.RegistImages;

public interface RegistImageService {
	List<RegistImages> findAll();

	List<RegistImages> findByRegistCode(String registCode);


}
