package com.borodatos.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.borodatos.model.Article;
import com.borodatos.model.ComicsArticle;
import com.borodatos.service.ArticleService;

/**
 * @author Vitali Usik
 * 
 */
@Controller
public class HomeController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/")
    public String homePage(Map<String, Object> map) {

        map.put("popular", new Article());
        map.put("listPopular", articleService.listPopular());
        map.put("comics", new ComicsArticle());
        map.put("listComics", articleService.listComics());

        return "home";
    }

}
