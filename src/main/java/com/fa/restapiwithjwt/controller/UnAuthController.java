package com.fa.restapiwithjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/un-auth")
public class UnAuthController {
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome this endpoint is not secure";
	}
}
