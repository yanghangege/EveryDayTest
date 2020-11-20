package com.example.demo.test.Day9;


import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.ObjectUtil;
import com.google.common.collect.Lists;

import java.util.*;
import java.util.stream.Collectors;

public class demo4 {
    public static void main(String[] args) {
        Date date = DateUtil.date();
        List<scheme> scheme = Lists.newArrayList();
        List<scheme> scheme22 = Lists.newArrayList();
        scheme scheme1 = new scheme();
        scheme scheme2 = new scheme();
        scheme scheme3 = new scheme();
        scheme1.setStartTime("2020-10-14 14:57:22");
        scheme2.setStartTime("2020-10-15 14:57:22");
        scheme3.setStartTime("2020-10-14 14:57:22");


        scheme1.setEndTime("2020-10-16 14:57:22");
        scheme2.setEndTime("2020-10-17 14:57:22");
        scheme3.setEndTime("2020-10-16 14:57:22");

        scheme1.setStaffName("zhangsan");
        scheme2.setStaffName("lisi");
        scheme3.setStaffName("wangwu");
        scheme.add(scheme1);
        scheme.add(scheme2);
        scheme.add(scheme3);

        List<scheme> studentDistinctList = scheme.stream()
                .collect(Collectors.collectingAndThen
                        (Collectors.toCollection(() ->
                                        new TreeSet<>(Comparator.comparing(t -> t.getEndTime()))),
                                ArrayList::new
                        )
                );
        for (scheme sc :studentDistinctList){

            for (scheme sm : scheme){

                if (ObjectUtil.equal(sc.getEndTime(),sm.getEndTime()) && ObjectUtil.equal(sc.getStartTime(),sm.getStartTime())){

                    scheme scheme4 = new scheme();
                    scheme4.setStartTime(sc.getStartTime());
                    scheme4.setEndTime(sc.getEndTime());


                }
            }

        }


        System.out.println(studentDistinctList);

    }
}
