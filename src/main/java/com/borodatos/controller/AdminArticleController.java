package com.borodatos.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.borodatos.model.Article;
import com.borodatos.model.ImageList;
import com.borodatos.service.AdminArticleService;
import com.borodatos.service.ImageService;

/**
 * @author Vitali Usik
 * 
 */
@Controller
public class AdminArticleController {

    @Autowired
    private ImageService imageService;

    @Autowired
    private AdminArticleService adminArticleService;

    @RequestMapping("/admin/addArticle")
    public String addArticle(@ModelAttribute("article") Article article, BindingResult result, Map<String, Object> map) {

        map.put("images", new ImageList());
        map.put("listImages", imageService.listImages());

        return "article_edit";
    }

    @RequestMapping("/admin/article/save")
    public String saveComics(@ModelAttribute("article") Article article, BindingResult result) {

        adminArticleService.saveArticle(article);

        // return "redirect:/admin/edit/" + article.getLink();
        return "redirect:/";
    }

    // @RequestMapping("/admin/edit/{link}")
    // public String editArticle(@PathVariable("link") String link, Map<String,
    // Object> map) {
    //
    // Article article = adminArticleService.retrieveArticle(section, link);
    // map.put("comics", article);
    //
    // map.put("images", new ImageList());
    // map.put("listImages", imageService.listImages());
    //
    // return "comics_edit";
    // }
}
