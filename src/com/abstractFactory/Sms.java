package com.abstractFactory;


public class Sms implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms");
    }
}
