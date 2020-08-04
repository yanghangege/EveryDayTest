package com.example.demo.test.Day8;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class mapstruct {
    public static void main(String[] args) throws ParseException {
        //获取当前日期
        Date date = new Date();

//创建Calendar实例
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);   //设置当前时间
        cal.add(Calendar.YEAR, 1);  //在当前时间基础上加一年

//将时间格式化成yyyy-MM-dd HH:mm:ss的格式
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(format.format(cal.getTime()));
//
//        Date parse = format.parse(format.format(cal.getTime()));



        System.out.println(DateUtil.date(cal));
    }



}
