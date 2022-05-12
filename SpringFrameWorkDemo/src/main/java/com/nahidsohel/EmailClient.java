package com.nahidsohel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmailClient {

    @Autowired
    @Qualifier("basicSpellChecker")
    private SpellChecker spellChecker;
//    @Autowired
//    EmailClient(@Qualifier("basicSpellChecker") SpellChecker spellChecker){
//        this.spellChecker = spellChecker;
//    }

//    public void setSpellChecker(SpellChecker spellChecker) {
//        this.spellChecker = spellChecker;
//    }

    void sendMail(String emailMessage){
        spellChecker.checkSpelling(emailMessage);
    }
}
