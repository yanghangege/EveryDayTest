package com.example.demo.test.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class memberNames {
    public static void main(String[] args) {
        List<String> memberName = new ArrayList<>();
        memberName.add("Amitabh");
        memberName.add("Shekhar");
        memberName.add("Aman");
        memberName.add("Rahul");
        memberName.add("Shahrukh");
        memberName.add("Salman");
        memberName.add("Yana");
        memberName.add("Lokesh");

//        memberName.stream().filter((s -> s.startsWith("A"))).forEach(System.out :: println);
//
//        memberName.stream().filter(s -> s.startsWith("A")).map(String::length).forEach(System.out :: println);

//        boolean machedResult = memberName.stream().anyMatch(s -> s.startsWith("A"));
//        System.out.println(machedResult);

//        List<String> memeberN = memberName.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
//        System.out.println(memeberN);

//        long totalMatched = memberName.stream().filter(s -> s.startsWith("A")).count();
//        System.out.println(totalMatched);

        //reduce()
//        Optional<String> reduce = memberName.stream().reduce((s1 ,s2) -> s1 + "#  " +s2);
//        reduce.ifPresent(System.out::println);


//        System.out.println(memberName.stream().filter(s -> s.startsWith("L")).findFirst().get());
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        //Here creating a parallel stream
        Stream<Integer> stream = list.parallelStream();
        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.print(evenNumbersArr);
    }

}
