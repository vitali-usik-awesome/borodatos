package com.borodatos.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

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

    @RequestMapping("/index")
    public String listArticles(Map<String, Object> map) {

        map.put("article", new Article());
        map.put("contactList", articleService.listArticle());

        return "article";
    }
    
    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addArticle(@ModelAttribute("article") Article article,
            BindingResult result) {

        articleService.addArticle(article);

        return "redirect:/index";
    }

    @RequestMapping("/delete/{articleId}")
    public String deleteArticle(@PathVariable("articleId") Integer articleId) {

        articleService.removeArticle(articleId);

        return "redirect:/index";
    }
}
