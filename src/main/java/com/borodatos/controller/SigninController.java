package com.borodatos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Vitali Usik
 * 
 */
@Controller
public class SigninController {

    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String signin() {
        return "huser/signin";
    }
    
    @RequestMapping(value = "/signin-failure", method = RequestMethod.GET)
    public String signinFailure() {
        return "huser/signin_failure";
    }
}
