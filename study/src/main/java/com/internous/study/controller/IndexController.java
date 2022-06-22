package com.internous.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/study")
public class IndexController {
	
	@RequestMapping("/")
	public String index() {
		return "Hello!";
	}

}
