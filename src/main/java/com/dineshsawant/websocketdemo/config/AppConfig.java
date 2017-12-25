package com.dineshsawant.websocketdemo.config;

import com.dineshsawant.websocketdemo.beanutil.RandomNameBeanUtil;
import com.dineshsawant.websocketdemo.servlet.RandomNameServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dnsh on 25/12/17.
 */
@Configuration
public class AppConfig {
    @Bean
    public ServletRegistrationBean socketServlet(){
        return new ServletRegistrationBean(new RandomNameServlet(), "/ws/random");
    }

    @Bean
    public RandomNameBeanUtil randomNameBeanUtil(){
        return new RandomNameBeanUtil();
    }
}
