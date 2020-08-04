package com.example.demo.test.Day7;

public class test4 {
    public static void main(String[] args) {
        final int NINE = 9;
        Long id = 123456789L;
        boolean report = id.toString().length() == NINE;

        System.out.println(report);
    }
}
