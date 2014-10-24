package com.borodatos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Vitali Usik
 * 
 */
@Controller
public class ErrorsController {

    private static final String GENERAL_ERROR_VIEW = "/error/general";
    
    @RequestMapping(value = "/errors/404.html")
    public ModelAndView handle404(Model model) {

        ModelAndView modelAndView = new ModelAndView(GENERAL_ERROR_VIEW);
        modelAndView.addObject("errorCode", "404");
        modelAndView.addObject("message", "Error 404 happens");

        return modelAndView;
    }
}
