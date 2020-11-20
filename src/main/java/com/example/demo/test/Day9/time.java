package com.example.demo.test.Day9;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.util.Date;

/**
 * @author yanghan
 * @date 2020/10/27 10:37
 */
public class time {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateNowStr = sdf.format(d);

        DateTime parse = DateUtil.parse(DateUtil.formatDate(d));
        System.out.println(parse);
    }
}
