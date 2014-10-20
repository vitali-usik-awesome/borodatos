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

    @RequestMapping(value = "/husignin", method = RequestMethod.GET)
    public String signin() {
        return "huser/husignin";
    }

    @RequestMapping(value = "/husignin-failure", method = RequestMethod.GET)
    public String signinFailure() {
        return "huser/husignin_failure";
    }

    /**
     * only for test with spring security, page huser_login contains only logout
     * link
     * 
     * @return
     */
    @RequestMapping("/huiadmin")
    public String huiLogin() {
        return "huser_login";
    }
}
