package com.example.demo.test.day10;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author yanghan
 * @date 2020/11/16 10:15
 */
public class TimeDemo {
    public static void main(String[] args) {
        String patrolTime = "2020-11-16 00:00:00";
//        String startTime = "2020-11-16";
        String endTime = "20:00:00";
        String yes = "2020-11-16";
//        if (DateUtil.parse(startTime,"HH:mm:ss").before(DateUtil.formatTime(date))){
//        String limitTime = yes + " " + endTime;
//        Date parse = DateUtil.parse(limitTime, "yyyy-MM-dd HH:mm:ss");
//        System.out.println(parse);
//        LocalDate now = LocalDate.now();
//        LocalDate localDate = LocalDate.now();
//        LocalTime now = LocalTime.now();
//
//        System.out.println(now);
//        String date = "2020-11-14";
//        int month = DateUtil.month(DateUtil.parse(date)) + 1;
//        System.out.println(month);
//        int monthValue = localDate.getMonthValue();
//        System.out.println(monthValue);

//        System.out.println(now);
//        System.out.println(now.getMonthValue());
//        System.out.println(localDate);

//        LocalTime limitEnd = LocalTime.parse(endTime, DateTimeFormatter.ofPattern("HH:mm:ss"));
//        System.out.println(limitEnd);
//        LocalDate limitTime = LocalDate.parse(yes, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//        System.out.println(limitTime);
//
//        LocalDateTime patrolTime1 = LocalDateTime.parse(patrolTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        System.out.println(patrolTime1);
//        String limit =  limitTime  + " " + limitEnd;
//        LocalDateTime patrolLimitTime = LocalDateTime.parse(limit, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
//        System.out.println(patrolLimitTime);
//        if (patrolTime1.toLocalDate().isAfter(ChronoLocalDate.from(patrolLimitTime))) {
//            System.out.println("*************");
//        }
//            System.out.println(true);


//        String format = "hh:mm:ss";
//        String formatDateTime = LocalTime.now().format(DateTimeFormatter.ofPattern(format));
//        System.out.println(formatDateTime);
    }
}
