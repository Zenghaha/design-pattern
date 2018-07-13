package com.staticFactory;

public class FactoryTest {

    public static void main(String[] args) {
        Sender mail = SendFactory.produceMail();
        mail.send();

        Sender sms = SendFactory.produceSms();
        sms.send();
    }
}
