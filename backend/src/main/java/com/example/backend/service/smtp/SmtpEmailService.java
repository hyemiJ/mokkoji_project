package com.example.backend.service.smtp;


public interface SmtpEmailService {


	//public void sendMail(EmailRendererDTO dto);
	
	public void sendMessage(String from, String subject, String name);
}
