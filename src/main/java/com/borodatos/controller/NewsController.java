package com.borodatos.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.borodatos.model.ImageList;
import com.borodatos.model.News;
import com.borodatos.service.ImageService;
import com.borodatos.service.NewsService;

/**
 * @author Vitali Usik
 * 
 */
@Controller
public class NewsController {

    @Autowired
    private ImageService imageService;

    @Autowired
    private NewsService newsService;

    @RequestMapping("/admin/addNews")
    public String addNews(@ModelAttribute("news") News news, BindingResult result, Map<String, Object> map) {

        map.put("images", new ImageList());
        map.put("listImages", imageService.listImages());

        return "news_edit";
    }

    @RequestMapping("/admin/news/save")
    public String saveNews(@ModelAttribute("news") News news, BindingResult result) {

        newsService.saveNews(news);

        // return "redirect:/admin/edit/" + article.getLink();
        return "redirect:/";
    }

    @RequestMapping("/admin/showAllNews")
    public String showAllNews(Map<String, Object> map) {

        map.put("news", new News());
        map.put("listNews", newsService.listAllNews());

        return "list_news_admin";
    }

    // not ready
    @RequestMapping("/admin/editNews/{id}")
    public String editNews(@PathVariable("id") String id, Map<String, Object> map) {

        News news = newsService.retrieveNews(id);
        map.put("news", news);

        map.put("images", new ImageList());
        map.put("listImages", imageService.listImages());

        return "news_edit";
    }
}
