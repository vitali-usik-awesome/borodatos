package com.borodatos.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.borodatos.model.Article;
import com.borodatos.service.ArticleService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Controller
public class HomeController {

	private static Log log = LogFactory.getLog(HomeController.class);
	
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/")
	public String home() {
		return "hello";
	}
	
	@RequestMapping("/ololo")
	public @ResponseBody String ololo() {
		return "Ololo!";
	}
	
	@RequestMapping(value="/first")
	public String listArticles(Map<String, Object> map) {
		
		log.info("from controller - start");
		log.info("articles[1]: " + articleService.listArticle().get(0).getContent());
		return "article";
	}
}