package com.cxinxi.spacedemo.pattern;

public class MobilePhone implements  Phone {
    @Override
    public void call(XList sxList) {
        sxList.display();
    }
}
