package com.main.controller;

import java.util.SplittableRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.main.service.Customerservice;
import com.main.service.Emailverifyservice;
import com.main.service.Merchantservice;

@RestController
@CrossOrigin(origins="*")
public class EmailverifyController 
{
	@Autowired
	Emailverifyservice evs;
	@Autowired
	Merchantservice ms;
	@Autowired
	Customerservice cs;
	
	@PostMapping("/emailverify")
	public StringBuilder emailverify(@RequestParam String email)
	{
		String subject="TECHI@RT <noreply>";
		SplittableRandom sp=new SplittableRandom();
		StringBuilder otp=new StringBuilder();
		for(int i=0;i<=3;i++)
		{
			otp.append(sp.nextInt(1,9));
		}
		String body="You tried to log in on our portal. "
				+ "To authenticate, please use the following One Time Password (OTP) : "+otp+ 
				"  .Don't share this OTP with anyone. Our customer service team will never ask you for your password, OTP, credit card, or banking info."
				+ " We hope to see you again soon."
				+ "If you did not make this request, you can safely ignore this email.";
		evs.Emailverify(email, subject, body);
		return otp;
	}
	
	@PostMapping("/emailcheck")
	public boolean emailduplicacy(@RequestParam String email)
	{
		if(ms.emailduplicatecheck(email) == false  &&  cs.emailduplicatecheck(email) == false)
		{
			return false;
			//duplicate email not available
		}
		else
		{
			return true;
			//duplicate email available
		}
	}
}
