package com.borodatos.mvc.news;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewsController {

	@RequestMapping("/news")
	public @ResponseBody String news() {
		return "News!";
	}
}
