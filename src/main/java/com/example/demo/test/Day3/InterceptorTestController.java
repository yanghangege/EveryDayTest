package com.example.demo.test.Day3;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterceptorTestController {

    @RequestMapping(value = {"/","/test"})
    public String test (Model model){
        System.out.println("\n --------------MainController.test ---");
        System.out.println("** You are in Controller **");
        return "test";
    }

    //This path is no longer used
    //It will be redirected by OldLoginInterceptor
    @Deprecated
    @RequestMapping("/admin/oldLogin")
    public String oldLogin(Model model){
        //Code here never run
        return "oldLogin";
    }

    @RequestMapping(value = "/admin/login")
    public String login (Model model){
        System.out.println("\n------MainController.login ---");
        System.out.println("You are in Controller **");

        return "login";
    }


}
