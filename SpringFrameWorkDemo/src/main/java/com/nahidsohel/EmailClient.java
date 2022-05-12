package com.nahidsohel;

import org.springframework.stereotype.Component;

public class EmailClient {

    private SpellChecker spellChecker;

//    EmailClient(SpellChecker spellChecker){
//        this.spellChecker = spellChecker;
//    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    void sendMail(String emailMessage){
        spellChecker.checkSpelling(emailMessage);
    }
}
