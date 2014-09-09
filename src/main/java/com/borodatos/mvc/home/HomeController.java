package com.borodatos.mvc.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "hello";
	}
	
	@RequestMapping("/ololo")
	public @ResponseBody String ololo() {
		return "Ololo!";
	}
}
