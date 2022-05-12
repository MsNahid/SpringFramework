package com.nahidsohel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailApplication {
    public static void main(String[] args) {

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailClient emailClient = applicationContext.getBean("emailClient", EmailClient.class);
//        EmailClient emailClient = new EmailClient(new AdvancedSpellChecker());
        emailClient.sendMail("Hey, It's Nahid.This is my firstMail.");
        emailClient.sendMail("Hey, It's Tom. This is my secondMail.");
    }
}