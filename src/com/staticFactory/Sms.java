package com.staticFactory;

public class Sms implements Sender {

    @Override
    public void send() {
        System.out.println("this is sms");
    }
}
