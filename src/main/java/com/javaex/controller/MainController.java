package com.javaex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

	@GetMapping(value="/")
	public String index() {
		System.out.println("MainController.index()");
		return "foword:/index.html";
	}
}
