package com.example.springcloudeurekademo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/app")
public class AppController {
	
	
	@GetMapping(path="/products")
	public Response getProducts() {
		Product p1 = new Product("Apple Iphone", 1000);
		Product p2 = new Product("Samsung LED TV", 2000);
		Product p3 = new Product("Hydrate Water Bottler", 30);
		Product p4 = new Product("Apple Watch", 500);
		Product p5 = new Product("Apple MacBook", 2500);
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		Response response = new Response(101,"Products Fetched",products);
		
		return response;
		//	return "Products";
	}
}
