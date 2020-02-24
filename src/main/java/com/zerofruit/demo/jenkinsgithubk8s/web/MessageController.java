package com.zerofruit.demo.jenkinsgithubk8s.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/message")
    public Message getMessage() {
        return new Message("hello world");
    }
}
