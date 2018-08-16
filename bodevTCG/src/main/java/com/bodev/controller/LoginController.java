package com.bodev.controller;

import com.bodev.entity.User;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @GetMapping("")
    public String firstPage () {
        return "/login";
    }
    @GetMapping(path = "/error")
    public String errorPage(){
        return "login";
    }

    @GetMapping("/login")
    public String authenticateUser (@RequestParam String userN, String passwordTry) {
        String returnViewName = "login";
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (user.getUserName() == userN) {
            if(BCrypt.checkpw(passwordTry, user.getPassword())) {
                returnViewName = "Success";
            }
            else returnViewName = "redirect:/login2";
        }
        return returnViewName;
    }
}
