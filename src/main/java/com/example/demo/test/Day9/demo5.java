//package com.example.demo.test.Day9;
//
//import com.google.common.base.Splitter;
//import com.google.common.collect.Lists;
//
//
//import java.util.List;
//import java.util.Map;
//import java.util.Objects;
//import java.util.stream.Collectors;
//
//public class demo5 {
//    public static void main(String[] args) {
//        List<scheme> scheme = Lists.newArrayList();
//        scheme scheme1 = new scheme();
//        scheme scheme2 = new scheme();
//        scheme scheme3 = new scheme();
//        scheme1.setStartTime("2020-10-14 14:57:22");
//        scheme2.setStartTime("2020-10-15 14:57:22");
//        scheme3.setStartTime("2020-10-14 14:57:22");
//
//
//        scheme1.setEndTime("2020-10-16 14:57:22");
//        scheme2.setEndTime("2020-10-17 14:57:22");
//        scheme3.setEndTime("2020-10-16 14:57:22");
//
//        scheme1.setStaffName("zhangsan");
//        scheme2.setStaffName("lisi");
//        scheme3.setStaffName("wangwu");
//
//        scheme1.setOrder(1L);
//        scheme2.setOrder(2L);
//        scheme3.setOrder(1L);
//
//        scheme.add(scheme1);
//        scheme.add(scheme2);
//        scheme.add(scheme3);
//
//        List<scheme> scccc = Lists.newArrayList();
//        Map<Long, List<scheme>> customerInfos = scheme
//                .stream()
//                .filter(each -> Objects.nonNull(each.getOrder()))
//                .collect(Collectors.groupingBy(e -> e.getOrder()));
//
//        customerInfos.forEach((k, v) -> {
//            scheme vo = new scheme();
//            vo.setStartTime(v.get(0).getStartTime());
//            vo.setEndTime(v.get(0).getEndTime());
//            String staffName = v.stream().map(scheme::getStaffName).collect(Collectors.joining(","));
//            vo.setStaffName(staffName);
//            scccc.add(vo);
//        });
//        System.out.println(scccc);
//
//
////        System.out.println(customerInfos);
//    }
//}
