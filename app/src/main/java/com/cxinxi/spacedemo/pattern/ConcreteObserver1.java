package com.cxinxi.spacedemo.pattern;

import android.view.View;

public class ConcreteObserver1 implements Observer {
    @Override
    public void subscribe(XList sxList) {
        sxList.add("ConcreteObserver1");


    }

    @Override
    public void display(XList sxList) {
        sxList.display();

    }

    @Override
    public void notifyDataChange(View view) {

    }
}
