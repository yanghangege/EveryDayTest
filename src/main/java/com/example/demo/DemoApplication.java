package com.example.demo;

import com.example.demo.test.day1.LibraryProperties;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
//为了能让 Spring 找到自己写的拦截器
@ServletComponentScan
public class DemoApplication implements InitializingBean {
    private final LibraryProperties libraryProperties;
    public DemoApplication(LibraryProperties libraryProperties){
        this.libraryProperties = libraryProperties;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void afterPropertiesSet(){
        System.out.println(libraryProperties.getBooks());
        System.out.println(libraryProperties.getLocation());
    }

}
