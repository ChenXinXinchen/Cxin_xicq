package com.cxinxi.spacedemo.pattern;

public class Adapter extends AdapterImpl {

    private  XList sxList;

    public Adapter(XList sxList) {
        this.sxList = sxList;
    }


    @Override
    public void typeC2Vga() {
        sxList.remove(0);
    }

    @Override
    public void typeC2HDMI() {
        sxList.display();
    }
}
