package com.nahidsohel;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class JavaLifeCycleHooks {

    @PostConstruct
    public void init(){
        System.out.println("Inside init JavaLifeCycle Hooks.");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Inside destory JavaLifeCycle Hooks ");
    }
}
