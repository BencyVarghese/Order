package com.order.ordersystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@GetMapping("/order")
	public String getOrder() {
		return "Hello Bency6";
				
	}

}
