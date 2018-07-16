package com.memento;

public class Memento {

    //目的是保存一个对象的某个状态，以便在适当的时候恢复对象

    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
