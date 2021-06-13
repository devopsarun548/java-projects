package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeomoController {

	@GetMapping("/greeting")
	@ResponseBody
	public String greeting() {
		return "<h1>Welcome to my home page/<h1>";
	}
}
