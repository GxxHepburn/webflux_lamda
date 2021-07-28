package com.gxx.webflux.reactor8;

import java.util.Observable;

/**
 * @author gxx
 * @create 2021-07-28 21:50
 */
public class ObserverDemo extends Observable {

    public static void main(String[] args) {
        ObserverDemo observer = new ObserverDemo();

        observer.addObserver((o, arg) -> {
            System.out.println("发生了变化");
        });

        observer.addObserver((o, arg) -> {
            System.out.println("收到被观察者通知，准备改变");
        });

        observer.setChanged();
        observer.notifyObservers();
    }
}
