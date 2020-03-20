package com.example.demo.test.Day2;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Mycontrolelr {

    @GetMapping("hello")
    public String getHello() throws InterruptedException{
        Thread.sleep(1000);
        QrCodeUtil.generate("https://www.priusis.com/", 300, 300, FileUtil.file("h:/qrcode.jpg"));


        return "hello";
    }
}
