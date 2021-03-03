package com.cxinxi.spacedemo.pattern;

import android.view.View;

public interface Observer {

    void subscribe(XList sxList);

    void display(XList sxList);

    void notifyDataChange(View view);
}
