package com.cn8001.gdgegitim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@Controller
public class GdgegitimApplication {

	public static void main(String[] args) {
		SpringApplication.run(GdgegitimApplication.class, args);
	}

	@GetMapping
	public String homePage(){
		return "index";
	}
	
}
