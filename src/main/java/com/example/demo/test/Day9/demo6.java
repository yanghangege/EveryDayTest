package com.example.demo.test.Day9;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class demo6 {
    public static void main(String[] args) {
        List<Sche> scheList = Lists.newArrayList();
        List<Long> ids = Lists.newArrayList();
        ids.add(1L);
        ids.add(4L);
        ids.add(2L);
        ids.add(4L);
        ids.add(5L);
        ids.add(6L);
        ids.add(7L);
        System.out.println(ids);
        Sche sche1 = new Sche();
        Sche sche2 = new Sche();
        Sche sche3 = new Sche();

        sche1.setStaffId(1L);
        sche2.setStaffId(2L);
        sche3.setStaffId(3L);

        sche1.setStaffName("12312三123张");
        sche2.setStaffName("123123123李四");
        sche3.setStaffName("123123123王五");

        sche1.setOrder(1L);
        sche2.setOrder(2L);
        sche3.setOrder(1L);
        scheList.add(sche1);
        scheList.add(sche2);
        scheList.add(sche3);

        for (Sche s: scheList){
           if ( ids.contains(s.getStaffId())){
               System.out.println(s);
           }
        }

//        for(Sche s : scheList){
//            if (s.getStaffName().contains("张")){
//                System.out.println(s);
//            }
//        }


//        Map<Long, List<Sche>> result = scheList
//                .stream()
//                .collect(Collectors.groupingBy(Sche::getOrder));
//
//        List<Sche> schemeResult = Lists.newArrayList();
//
//        result.forEach((k, v) -> {
//            Sche vo = new Sche();
//
//            String staffName = v.stream().map(Sche::getStaffName).collect(Collectors.joining(","));
//            System.out.println("/*************************");
//            System.out.println(v);
//            //还需要拼接一个ID
//            StringBuilder staffIds = new StringBuilder();
//            for (Sche e : v){
//                staffIds.append(e.getStaffId()).append(",");
//            }
//
//            String str3 = staffIds.substring(0, staffIds.length() - 1);
//            vo.setStaffIdList(str3);
//            vo.setStaffName(staffName);
//            schemeResult.add(vo);
//        });
//        System.out.println("/--------------------------");
//        System.out.println(schemeResult);
    }
}
