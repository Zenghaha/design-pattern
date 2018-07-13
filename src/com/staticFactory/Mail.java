package com.staticFactory;

public class Mail implements Sender {

    @Override
    public void send() {
        System.out.println("this is mail");
    }
}
