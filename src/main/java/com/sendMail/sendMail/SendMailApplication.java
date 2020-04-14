package com.sendMail.sendMail;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.sendMail"})
public class SendMailApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SendMailApplication.class, args);
	}

}
