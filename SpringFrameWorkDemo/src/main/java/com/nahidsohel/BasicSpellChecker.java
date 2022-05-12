package com.nahidsohel;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

//@Component
public class BasicSpellChecker implements SpellChecker {

    public void init() {
        System.out.println("init inside Basic Spell Checker");
    }

    @Override
    public void checkSpelling(String emailMessage) {
        if (emailMessage != null) {
            System.out.println("Checking spelling using BasicSpellChecker...");
            System.out.println("Spell Checking Completed!!");
        } else {
            throw new RuntimeException("An exception occurred " +
                    "while checking Spelling");
        }
    }

    public void destroy(){
        System.out.println("Destroy inside Basic Spell Checker.");
    }


}
