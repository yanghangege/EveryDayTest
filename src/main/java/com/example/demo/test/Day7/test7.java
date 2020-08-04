package com.example.demo.test.Day7;

import com.google.common.collect.Lists;

import java.util.ArrayList;

public class test7 {
    public static void main(String[] args) {
        ArrayList list = Lists.newArrayList("11" , "22" , "33" , "44" , "55");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
