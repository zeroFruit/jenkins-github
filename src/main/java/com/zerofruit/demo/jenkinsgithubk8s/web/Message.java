package com.zerofruit.demo.jenkinsgithubk8s.web;

import lombok.Getter;

@Getter
public class Message {
    private String data;

    public Message(String data) {
        this.data = data;
    }
}
