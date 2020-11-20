package com.example.demo.test.Day9;

import lombok.extern.slf4j.Slf4j;

import java.text.MessageFormat;

@Slf4j
public class Placeholder {
    public static void main(String[] args) {
//        String msg = "我是{},今年{}岁";
        String msg = "我是%s,今年%s岁";
        String name = "yanghan";
        String age = "22";
        log.info(msg,name,age);
        msg = String.format(msg,name,age);
        System.out.println(msg);
    }
}
