package com.borodatos.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.borodatos.model.Article;
import com.borodatos.model.ComicsArticle;
import com.borodatos.model.ImageList;
import com.borodatos.service.ArticleService;
import com.borodatos.service.ImageService;

/**
 * @author Vitali Usik
 * 
 */
@Controller
public class ComicsSectionController {
    
    @Autowired
    private ArticleService articleService;
    
    @Autowired
    private ImageService imageService;

//    @RequestMapping("/admin/edit/{link}")
//    public String editComics(@PathVariable("link") String link, Map<String, Object> map) {
//
//        Article article = articleService.retrieveComics(link);
//        map.put("comics", article);
//        
//        map.put("images", new ImageList());
//        map.put("listImages", imageService.listImages());
//
//        return "comics_edit";
//    }

    @RequestMapping("/comics/save")
    public String saveComics(@ModelAttribute("comics") ComicsArticle comics, BindingResult result) {
        articleService.saveComics(comics);

        return "redirect:/admin/edit/" + comics.getLink();
    }

    @RequestMapping("/admin/add")
    public String addComicsArticle(@ModelAttribute("comics") ComicsArticle comics, BindingResult result, Map<String, Object> map) {

        map.put("images", new ImageList());
        map.put("listImages", imageService.listImages());
        
        return "comics_edit";
    }

    @RequestMapping("/admin/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id) {

        articleService.removeComics(id);

        return "redirect:/";
    }
}
