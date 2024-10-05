package com.example.backend.service.registration;

import com.example.backend.entity.registration.RegistImages;
import com.example.backend.repository.registration.RegistImageRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegistImageServiceImpl implements RegistImageService {

	private final RegistImageRepository repository;
	

	@Override
	public List<RegistImages> findAll() {
		return null;
	}
	
	
	@Override
	public List<RegistImages> findByRegistCode(String registCode) {
		return repository.findByRegistCode(registCode);
	}
	
	
}
