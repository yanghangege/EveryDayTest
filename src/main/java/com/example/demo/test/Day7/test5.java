package com.example.demo.test.Day7;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class test5 {
    public static void main(String[] args) {

        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");
        List<String> myList1 = Lists.newArrayList("a1", "a2", "b1", "c2", "c1");

        List<String> a1 = myList.stream().filter(e -> !Objects.equals("a1", e)).collect(Collectors.toList());
        List<String> a2 = a1.stream().filter(e -> !Objects.equals("a2", e)).collect(Collectors.toList());
        System.out.println(a1);
        System.out.println(a2);

    }


}
