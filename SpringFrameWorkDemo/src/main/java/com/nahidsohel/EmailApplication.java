package com.nahidsohel;

public class EmailApplication {

    private BasicSpellChecker basicSpellChecker;
    public static void main(String[] args) {
        EmailClient emailClient = new EmailClient(new BasicSpellChecker());
        emailClient.sendMail("Hey, It's Nahid.This is my firstMail.");
        emailClient.sendMail("Hey, It's Tom. This is my secondMail.");
    }
}