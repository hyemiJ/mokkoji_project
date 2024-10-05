package com.example.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder 
public class UsersDTO {

	private String userId;
	private String password;
	private String name;
	private LocalDate birthDate;
	private String gender;
	private String phoneNumber;
	private String email;
	private int userSequence;
	private int isWithdrawn;
	private LocalDateTime withdrawalDate;
	private LocalDateTime updatedAt;
	private LocalDate createdAt;
	private int blockStatus;
	private String isAdmin;
	private String token;
	
	private String postalCode;
	private String streetAddress;
	private String detailedAddress;
	private int isDefault;
	private String locationName;
	private String recipientName;
	private String recipientPhone;
}
