package com.example.backend.repository.registration;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.entity.registration.RegistImages;
import com.example.backend.entity.registration.RegistImagesId;

import java.util.List;


public interface RegistImageRepository extends JpaRepository<RegistImages, RegistImagesId>{
	
	public List<RegistImages> findByRegistCode(String registCode);
}
