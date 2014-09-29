package com.borodatos.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.borodatos.model.ComicsArticle;
import com.borodatos.service.ArticleService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Vitali Usik
 *
 */
@Controller
public class HomeController {

	private static Log log = LogFactory.getLog(HomeController.class);
	
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/")
	public String homePage(Map<String, Object> map) {
		
		map.put("comics", new ComicsArticle()); 
		map.put("listComics", articleService.listComics());
		
		return "home";
	}
	
	@RequestMapping("/comics/{link}")
	public String comicsPage(@PathVariable("link") String link, Map<String, Object> map) {
		
		ComicsArticle comicsArticle = articleService.retrieveComics(link);
		map.put("comics", comicsArticle);
		
		return "comics_page";
	}
	
	@RequestMapping("/admin/edit/{link}")
	public String editComics(@PathVariable("link") String link, Map<String, Object> map) {

		log.info("link in EDIT action: " + link);
		ComicsArticle comicsArticle = articleService.retrieveComics(link);
        map.put("comics", comicsArticle); 

        return "comics_edit";
    }
	
	@RequestMapping("/comics/save")
	public String saveComics(@ModelAttribute("comics") ComicsArticle comics, BindingResult result) {
		articleService.saveComics(comics);
		
		return "redirect:/admin/edit/" + comics.getLink();
	}

}
