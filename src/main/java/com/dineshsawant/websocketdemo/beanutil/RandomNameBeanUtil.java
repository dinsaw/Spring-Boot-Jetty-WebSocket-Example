package com.dineshsawant.websocketdemo.beanutil;

import org.springframework.context.ApplicationContextAware;

import com.dineshsawant.websocketdemo.service.RandomNameService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

/**
 * Created by dnsh on 25/12/17.
 */
public class RandomNameBeanUtil implements ApplicationContextAware {
    private static ApplicationContext appCxt;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        appCxt = applicationContext;
    }

    public static RandomNameService getRandomNameService() throws BeansException {
        return (RandomNameService) appCxt.getAutowireCapableBeanFactory().getBean("randomNameSvc");
    }
}
