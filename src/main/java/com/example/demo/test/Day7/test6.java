package com.example.demo.test.Day7;

import java.util.stream.Stream;

public class test6 {
    public static void main(String[] args) {
        Stream<String> stream =
                Stream.of("d2", "a2", "b1", "b3", "c")
                        .filter(s -> s.startsWith("a"));

        stream.anyMatch(s -> true);    // ok
        stream.noneMatch(s -> true);   // exception
    }
}
