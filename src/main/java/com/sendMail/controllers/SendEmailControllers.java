package com.sendMail.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sendEmails")
public class SendEmailControllers {
    @GetMapping(value = "/test", produces = "application/json")
    public String testController(){
        return "DONE";
    }
}
