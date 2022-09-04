package com.example.demo;

import lombok.Getter;
import lombok.Setter;

public class UserInfo {

    @Getter
    private String name;

    @Getter
    @Setter
    private int age;

    private final String mew(){
        return "mewoMewo";
    }

    private static String dog(){
        return "How hooo";
    }

    public UserInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public UserInfo() {}
}
