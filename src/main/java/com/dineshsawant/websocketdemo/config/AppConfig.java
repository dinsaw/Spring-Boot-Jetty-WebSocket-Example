package com.dineshsawant.websocketdemo.config;

import com.dineshsawant.websocketdemo.servlet.RandomNameServlet;
import com.dineshsawant.websocketdemo.util.DemoBeanUtil;
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
    public DemoBeanUtil randomNameBeanUtil() {
        return new DemoBeanUtil();
    }
}
