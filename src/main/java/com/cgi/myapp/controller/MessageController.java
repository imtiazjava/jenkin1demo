package com.cgi.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class MessageController {

	@GetMapping("msg")
	public String message() {
		return "hello-world";
	}
}
