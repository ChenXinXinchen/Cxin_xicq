package com.cxinxi.spacedemo.pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    //增加观察者方法
    public void add(Observer observer) {
        observers.add(observer);
    }

    //删除观察者方法
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyObserver(XList sxList); //通知观察者方法
    public abstract void disPlayObserver(XList sxList); //通知观察者方法
}