package com.cxinxi.spacedemo.pattern;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SingletonImpl {
    private static SingletonImpl singletonImpl = new SingletonImpl();
    private String mString;

    public void setString(String mString) {
        this.mString = mString;
    }

    private XList list;

    private static volatile SingletonImpl singleton = null;


    public static SingletonImpl getInstance() {
        if (singleton == null) {
            synchronized (SingletonImpl.class) {
                if (singleton == null) {
                    singleton = new SingletonImpl();
                }
            }
        }
        return singleton;
    }


    private SingletonImpl() {
    }

    public static SingletonImpl getInstance2() {
        return singletonImpl;
    }

    public String getString() {
        return mString;
    }

    private static class SingletonInstance {
        private static final SingletonImpl INSTANCE = new SingletonImpl();
    }

    public static SingletonImpl getInstance3() {
        return SingletonInstance.INSTANCE;
    }

    public XList getList() {
        return list;
    }

    public void setList(XList sxList) {
        list = sxList;
    }

    public void display(XList sxList) {
        for (int i = 0; i < sxList.getSize(); i++) {
            System.out.println(sxList.get(i));
        }

    }
}


