package com.borodatos.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.borodatos.model.Article;
import com.borodatos.model.ComicsArticle;
import com.borodatos.service.ArticleService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Controller
public class HomeController {

	private static Log log = LogFactory.getLog(HomeController.class);
	
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/")
	public String homePage(Map<String, Object> map) {
		
		map.put("comics", new ComicsArticle());
		log.info("comics[1]: " + articleService.listComics().get(0).getContent()); 
		
		
		return "home";
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
	
    @RequestMapping("/article")
    public String listUsers(Map<String, Object> map) {

        map.put("article", new Article());
        map.put("listArticle", articleService.listArticle());
        
        return "article";
    }
}
