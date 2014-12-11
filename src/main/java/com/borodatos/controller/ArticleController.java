package com.borodatos.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.borodatos.model.Article;
import com.borodatos.service.ArticleService;

/**
 * @author Vitali Usik
 * 
 */
@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * @param link
     * @param map
     * @return
     */
    @RequestMapping("/{section}/{link}")
    public String articlePage(@PathVariable("section") String section, @PathVariable("link") String link, Map<String, Object> map) {

        Article article = articleService.retrieveArticle(section, link);
        map.put("comics", article);

        return "article_page";
    }
}