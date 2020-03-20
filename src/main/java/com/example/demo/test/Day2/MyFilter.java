package com.example.demo.test.Day2;

import com.sun.net.httpserver.HttpServer;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


@Component
@Slf4j
//在自己的过滤器的类上加上@WebFilter 然后在这个注解中通过它提供好的一些参数进行配置。
@WebFilter(filterName = "MyFilterWithAnnotation", urlPatterns = "/api/*")
public class MyFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("初始化过滤器" + filterConfig.getFilterName());
    }

    @Override
    public void destroy() {
        log.info("销毁过滤器");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //对请求进行预处理
        log.info("过滤器开始对请求进行预处理");
        HttpServletRequest httpServletRequest = (HttpServletRequest) request ;
        String requestUrl = httpServletRequest.getRequestURI();
        log.info("请求的接口为：" + requestUrl);
        long startTime = System.currentTimeMillis();
        //通过doFilter 方法实现过滤
        chain.doFilter(request,response);
        //上面的doFilter method End of execution  The user's request has returned
        long endTime = System.currentTimeMillis();
        log.info("This user's request has returned , Request time is : " +( endTime - startTime));

    }
}
