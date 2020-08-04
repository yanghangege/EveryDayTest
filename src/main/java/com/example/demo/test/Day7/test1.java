package com.example.demo.test.Day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

public class test1 {

    public static void main(String[] args) throws ParseException {
//        start();
        get();
    }

    public static void start() throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));

        String dateStr = "2019-01-01 12:12:12";
        System.out.println(simpleDateFormat.parse(dateStr));
    }

    private  static void get(){
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String,String> map = new HashMap<>();
        map.put("张三","25");
        map.put("王五","25");
        Set<String> set1 = map.keySet();
        Stream<String> stream3 = set1.stream();
        Collection<String> list2 = map.values();
        Stream<String> stream4 = list2.stream();
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();

        Integer[] arr = {12,10,14,25};
        Stream<String> stream6 = Stream.of("一", "二", "三");
        Stream<Integer> stream7 = Stream.of(arr);
//        System.out.println(stream6);
//        System.out.println(stream7);
    }


}
