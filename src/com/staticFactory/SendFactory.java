package com.staticFactory;

public class SendFactory {

    public static Sender produceMail() {
        return new Mail();
    }

    public static Sender produceSms() {
        return new Sms();

    }
}
