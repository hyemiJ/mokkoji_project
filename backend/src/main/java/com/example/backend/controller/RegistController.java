package com.example.backend.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.service.registration.RegistImageService;
import com.example.backend.service.registration.RegistService;

import java.util.Map;

@RestController
@Log4j2
@RequiredArgsConstructor
public class RegistController {
	@Autowired
	private final RegistService service;
	private final RegistImageService imageservice;
 

    @GetMapping("/reserve")
    public ResponseEntity<Map<String,Object>> getRegistsAndCounts( ) {
    	
    	
    	Map<String, Object> registsAndCounts = service.getRegistsAndDateCounts();
		
    	
    	registsAndCounts.put("reserveImage", imageservice.findByRegistCode("04RS") );
    	System.out.println("Registration Image"+imageservice.findByRegistCode("04RS"));
    	log.info("**********/reserve test");
        System.out.println("Registration Page"+registsAndCounts);
        
        
        return ResponseEntity.ok(registsAndCounts);
    }
	
	
	
	

}

