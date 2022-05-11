package com.nahidsohel;

public class EmailClient {

    private SpellChecker spellChecker;

    EmailClient(SpellChecker spellChecker){
        this.spellChecker = spellChecker;
    }

    void sendMail(String emailMessage){
        spellChecker.checkSpelling(emailMessage);
    }
}
