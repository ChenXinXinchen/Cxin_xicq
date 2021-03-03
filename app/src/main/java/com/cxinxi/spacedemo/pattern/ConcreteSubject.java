package com.cxinxi.spacedemo.pattern;

public  class ConcreteSubject extends Subject {

    @Override
    public void notifyObserver(XList sxList) {
        for (Object obs : observers) {
            ((Observer) obs).subscribe(sxList);
        }

    }

    @Override
    public void disPlayObserver(XList sxList) {
        for (Object obs : observers) {
            ((Observer) obs).display(sxList);
        }

    }
}