package com.hsbc.chatbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nicole on 2019/4/21.
 */

@RestController
@SpringBootApplication
public class ChatbotApplication {

	@RequestMapping("/")
	public String index() {
		return "Hello, Nicole";
	}

	@RequestMapping("/chatbot")
	public String chatbot() {
		return "Hello, Chatbot";
	}


	public static void main(String[] args) {
		SpringApplication.run(ChatbotApplication.class, args);
	}



}
