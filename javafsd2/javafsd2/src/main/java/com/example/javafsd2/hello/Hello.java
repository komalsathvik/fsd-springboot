package com.example.javafsd2.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Hello {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello(){
		return "hii welcome to my webpage";
	}
	@RequestMapping("/input")
	public String inputHello() {
		return "index";
	}
}
