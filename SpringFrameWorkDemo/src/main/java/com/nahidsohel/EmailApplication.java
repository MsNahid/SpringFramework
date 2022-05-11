package com.nahidsohel;

public class EmailApplication {
    public static void main(String[] args) {
        EmailClient emailClient = new EmailClient(new AdvancedSpellChecker());
        emailClient.sendMail("Hey, It's Nahid.This is my firstMail.");
        emailClient.sendMail("Hey, It's Tom. This is my secondMail.");
    }
}