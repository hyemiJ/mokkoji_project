package com.example.backend.service.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.entity.login.Address;
import com.example.backend.repository.login.AddressRepository;

import lombok.RequiredArgsConstructor;

@Service("AddressService")
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private final AddressRepository repository;
	
	@Override
	public List<Address> findByuserId(String userId) {
		
		return repository.findByUserId(userId);
	}


	@Override
	public void register(Address entity) {
		repository.save(entity);
		
	}

	@Override
	public Address findUserHomeAddress(String userId) {
		return repository.findByUserIdAndIsDefault(userId, 0);
	}

	@Override
	public void deleteById(int id) {
		repository.deleteById(id);

	}
	
	@Override
	public Address findByUserIdAndLocationName(String userId, String locationName) {
		
		return repository.findByUserIdAndLocationName(userId, locationName);
	}

	
}
