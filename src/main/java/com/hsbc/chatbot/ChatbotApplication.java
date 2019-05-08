package com.hsbc.chatbot;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hsbc.chatbot.vo.PolicyVO;
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
		return "Hello, Chatbot";
	}

	@RequestMapping("/policyQuery")
	public String chatbot() {
		PolicyVO policyVO = new PolicyVO();
		// Convert object to JSON string
		ObjectMapper mapper = new ObjectMapper();
		String jsonStr = "";
		try {
			jsonStr = mapper.writeValueAsString(policyVO);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return jsonStr;
	}


	public static void main(String[] args) {
		SpringApplication.run(ChatbotApplication.class, args);
	}



}
