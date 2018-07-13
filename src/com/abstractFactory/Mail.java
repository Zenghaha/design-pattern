package com.abstractFactory;


public class Mail implements Sender {

    @Override
    public void Send() {
        System.out.println("this is mail");
    }
}
