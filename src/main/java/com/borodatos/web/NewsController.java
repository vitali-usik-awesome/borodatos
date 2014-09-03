package com.borodatos.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.borodatos.model.News;
import com.borodatos.service.NewsService;

@Controller
public class NewsController {

	@Autowired
	private NewsService newsService;
	
	@RequestMapping("/index")
	public String listNews(Map<String, Object> map) {
		
		map.put("news", new News());
        map.put("newsList", newsService.listNews());

        return "news";
	}
	
	@RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addNews(@ModelAttribute("news") News news,
            BindingResult result) {

        newsService.addNews(news);

        return "redirect:/index";
    }
	
	@RequestMapping("/delete/{newsId}")
    public String deleteNews(@PathVariable("newsId") Integer newsId) {

        newsService.removeNews(newsId);

        return "redirect:/index";
    }
}
