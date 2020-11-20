package com.example.demo.test.Day9;

import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class demo3 {
    public static void main(String[] args) {
//        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
//        List<Integer> numbers2 = Arrays.asList(3, 4);
//        List<int[]> pairs =
//                numbers1.stream()
//                        .flatMap(i -> numbers2.stream()
//                                .map(j -> new int[]{i, j})
//                        )
//                        .collect(toList());
//        System.out.println(pairs);

//        IntStream evenNumber = IntStream.rangeClosed(1, 100).filter(n -> n%2 == 0);
//        IntStream evenNumber = IntStream.range(1, 100).filter(n -> n%2 == 0);
//        System.out.println(evenNumber.count());
//        Stream.iterate(new int[]{0,1}, t -> new int[]{t[1],t[0]+t[1]})
//                .limit(10)
//                .map(t -> t[0])
//                .forEach(System.out ::println);
        String json = "{\n" +
                "  \"paramz\": {\n" +
                "    \"feeds\": [\n" +
                "      {\n" +
                "        \"id\": 299076,\n" +
                "        \"oid\": 288340,\n" +
                "        \"category\": \"article\",\n" +
                "        \"data\": {\n" +
                "          \"subject\": \"荔枝新闻3.0：不止是阅读\",\n" +
                "          \"summary\": \"江苏广电旗下资讯类手机应用“荔枝新闻”于近期推出全新升级换代的3.0版。\",\n" +
                "          \"cover\": \"/Attachs/Article/288340/3e8e2c397c70469f8845fad73aa38165_padmini.JPG\",\n" +
                "          \"pic\": \"\",\n" +
                "          \"format\": \"txt\",\n" +
                "          \"changed\": \"2015-09-22 16:01:41\"\n" +
                "        }\n" +
                "      }\n" +
                "    ],\n" +
                "    \"PageIndex\": 1,\n" +
                "    \"PageSize\": 20,\n" +
                "    \"TotalCount\": 53521,\n" +
                "    \"TotalPage\": 2677\n" +
                "  }\n" +
                "}";
        JSONObject jsonObject = JSONObject.parseObject(json);
        String summary =null;

        System.out.println(summary);
        System.out.println(jsonObject);
    }
}
