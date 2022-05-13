package com.nahidsohel;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("singleton")
@PropertySource(value = "classpath:/application.properties")
public class AdvancedSpellChecker implements SpellChecker, InitializingBean, DisposableBean {

    @Value("${app.database.uri}")
    private String dataBaseUri;
    @Override
    public void checkSpelling(String emailMessage) {
        if (emailMessage != null) {
            // Determining the Language of the email Message
            // Check grammatical errors in the email Message
            // Check spellings in the email Message
            System.out.println("Checking Spelling using Advanced Spell Checker..");
            System.out.println("Spell Checking Completed!!");

        } else {
            throw new RuntimeException("An exception occurred while checking Spelling");
        }
    }

    // DisposableBean
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy properties.");
    }

    // InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Setting Properties after bean is initialized.");

    }
}
