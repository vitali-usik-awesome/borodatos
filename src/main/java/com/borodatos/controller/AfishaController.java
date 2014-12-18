package com.borodatos.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.borodatos.model.Afisha;
import com.borodatos.model.ImageList;
import com.borodatos.service.AfishaService;
import com.borodatos.service.ImageService;

/**
 * @author Vitali Usik
 * 
 */
@Controller
public class AfishaController {

    @Autowired
    private ImageService imageService;

    @Autowired
    private AfishaService afishaService;

    @RequestMapping("/admin/addAfisha")
    public String addAfisha(@ModelAttribute("afisha") Afisha afisha, BindingResult result, Map<String, Object> map) {

        map.put("images", new ImageList());
        map.put("listImages", imageService.listImages());

        return "edit_afisha";
    }

    @RequestMapping("/admin/afisha/save")
    public String saveAfisha(@ModelAttribute("afisha") Afisha afisha, BindingResult result) {

        afishaService.saveAfisha(afisha);

        // return "redirect:/admin/edit/" + article.getLink();
        return "redirect:/";
    }

    @RequestMapping("/admin/showAllAfisha")
    public String showAllAfisha(Map<String, Object> map) {

        map.put("afisha", new Afisha());
        map.put("listAfisha", afishaService.listAllAfisha());

        return "list_afisha_admin";
    }

    // not ready
    @RequestMapping("/admin/editAfisha/{id}")
    public String editNews(@PathVariable("id") String id, Map<String, Object> map) {

        Afisha afisha = afishaService.retrieveAfisha(id);
        map.put("afisha", afisha);

        map.put("images", new ImageList());
        map.put("listImages", imageService.listImages());

        return "edit_afisha";
    }
}
