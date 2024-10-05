package com.example.backend.service.registration;


import com.example.backend.domain.DateCountDTO;
import com.example.backend.entity.registration.Regist;

import java.util.List;
import java.util.Map;



public interface RegistService {
	
	List<Regist> getAllRegists();
    
	
	List<DateCountDTO> getCountsDays();
	
	Map<String, Object> getRegistsAndDateCounts();
}
