package com.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.main.service.Emailverifyservice;

@Service
public class EmailverifyImpl implements Emailverifyservice
{
	@Autowired
    private JavaMailSender emailsend;

	@Override
	public void Emailverify(String toemail, String subject, String body) 
	{
		// TODO Auto-generated method stub
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(toemail);
		message.setSubject(subject);
		message.setText(body);
		emailsend.send(message);
		
		System.out.println("mail sent successfully");
	}
	
	
}
