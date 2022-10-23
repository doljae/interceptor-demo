package com.example.demo;

import com.example.demo.interceptor.TestInterceptor;
import com.example.demo.interceptor.TestInterceptor2;
import com.example.demo.interceptor.TestInterceptor3;
import com.example.demo.interceptor.TestInterceptor4;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
      registry.addInterceptor(new TestInterceptor()).addPathPatterns("/test");
      registry.addInterceptor(new TestInterceptor2()).addPathPatterns("/test2");
      registry.addInterceptor(new TestInterceptor3()).addPathPatterns("/test3");
      registry.addInterceptor(new TestInterceptor4()).addPathPatterns("/test4");
    }
}
