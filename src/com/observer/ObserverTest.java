package com.observer;

public class ObserverTest {

    public static void main(String[] args) {
        Subject sub = new MySubject();
        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();
        sub.add(observer1);
        sub.add(observer2);

        sub.operation();

        sub.del(observer1);
        sub.operation();
    }

}
