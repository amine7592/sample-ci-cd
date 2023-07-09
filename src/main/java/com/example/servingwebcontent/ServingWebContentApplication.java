package com.example.servingwebcontent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class ServingWebContentApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Welcome Page";
	}

	public static void main(String[] args) {
		SpringApplication.run(ServingWebContentApplication.class, args);
	}

}


