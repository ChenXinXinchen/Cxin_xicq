package com.cxinxi.spacedemo.pattern;

public interface XList<T> {
    void clear();

    // 判断线性表是否为空操作
    boolean isEmpty();

    // 获取线性表中元素的长度操作
    int getSize();


    // 获取指定位置上面的元素操作
    T get(int i);

    // 在指定位置上面插入元素的操作
    void insert(int i, T x);

    // 删除指定位置上面的元素的操作
    void remove(int i);

    // 查找指定元素的位置首次出现的位置操作
    int indexOf(T x);

    // 显示线性表中的内容操作
    void display();

    void add(T o);

    void remove(T o);
}
