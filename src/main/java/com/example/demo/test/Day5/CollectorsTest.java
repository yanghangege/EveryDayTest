package com.example.demo.test.Day5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsTest {
    public static void toCollectorsTest(List<String> list){
        List<String> ll = list.stream().collect(Collectors.toCollection(LinkedList::new));
        System.out.println(ll);

    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("123","456","789","1101","212121121","asdaa","3e3e3e","2321eew");
//        toCollectorsTest(list);
//        joiningTest(list);
//        mapingTest(list);
//        maxByAndMinByTest(list);
//        summingTest(list);
        reducingTest(list);
    }

    public static void joiningTest(List<String> list){
        //无参方法
        String s = list.stream().collect(Collectors.joining());
        System.out.println(s);
        //指定连接符
        String ss = list.stream().collect(Collectors.joining("-"));
        System.out.println(ss);
        //指定连接符和前后缀
        String sss = list.stream().collect(Collectors.joining("-","S","E"));
        System.out.println(sss);
    }
    public static void mapingTest(List<String> list){
        List<Integer> ll = list.stream().limit(5).collect(Collectors.mapping(Integer::valueOf,Collectors.toList()));
        System.out.println(ll);
    }
    public static void maxByAndMinByTest(List<String> list){
        System.out.println(list.stream().collect(Collectors.maxBy((a,b) -> a.length()-b.length())));
        System.out.println(list.stream().collect(Collectors.minBy((a,b) -> a.length()-b.length())));
    }

    public static void summingTest(List<String> list){
        int i = list.stream().limit(3).collect(Collectors.summingInt(Integer::valueOf));
        long l = list.stream().limit(3).collect(Collectors.summingLong(Long::valueOf));
        double d = list.stream().limit(3).collect(Collectors.summingDouble(Double::valueOf));
        System.out.println(i +"\n" +l + "\n" + d);
    }
    public static void reducingTest(List<String> list){
        System.out.println(list.stream().limit(4).map(String::length).collect(Collectors.reducing(Integer::sum)));
        System.out.println(list.stream().limit(3).map(String::length).collect(Collectors.reducing(0, Integer::sum)));
        System.out.println(list.stream().limit(4).collect(Collectors.reducing(0,String::length,Integer::sum)));
    }
}
