package com.example.demo.test.Day3;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        System.out.println("\n ------------------- LogInterception.preHandle ------");
        System.out.println("Request URL : " + request.getRequestURI());
        System.out.println("Start Time : " + System.currentTimeMillis());
        request.setAttribute("startTime" , startTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("\n----------- LogInterception.postHandle -------");
        System.out.println("Request URL : " + request.getRequestURI());

        // you can add attributes in the ModelAndView and use that in the view page

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("\n ---------- LogInterception.afterCompetion ---");

        long startTime = (Long)request.getAttribute("StartTime");
        Long endTime  = System.currentTimeMillis();
        System.out.println("Request URL : " + request.getRequestURI());
        System.out.println("End Time : " + endTime);
        System.out.println("Time Taken :"  + (endTime - startTime ));

    }
}
