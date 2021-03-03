package com.cxinxi.spacedemo.pattern;

public class SxList<T> implements XList<T> {
    // 线性表存储空间
    private Object[] listElem;
    // 线性表的当前长度
    private int curLen;

    private  static  final  int DEFAULT_SIZE= 12 ;

    @Override
    public void clear() {
        curLen = 0;
        if(listElem == null || listElem.length < 1){
            return;
        }
        for(int i= 0; i< listElem.length -1; i ++ ){
            listElem[i] =  null ;
        }
    }

    @Override
    public boolean isEmpty() {

        return curLen == 0  ;
    }

    @Override
    public int getSize() {
        return curLen;
    }

    @Override
    public T get(int i) {
        if (i < 0 || i > curLen) {
            throw new RuntimeException("");
        }
        return (T) listElem[i];
    }

    @Override
    public void insert(int i, T x) {
        // 判断表是否满了
        if (curLen == listElem.length) {
            throw new RuntimeException("存储空间已经满了，无法插入新的元素");
        }
        // 插入的位置不合法
        if (i < 0 || i > curLen) {
            throw new RuntimeException("插入的位置不合法");
        }
        // 必须要从最后一个元素开始依次逐个后移动，直到第i个数据元素移动完毕为止。
        for (int j = curLen; j > i; j--) {
            listElem[j] = listElem[j - 1];
        }
        listElem[i] = x;
        curLen++;
    }

    @Override
    public void remove(int i) {
        if (i < 0 || i > curLen - 1) {
            throw new RuntimeException();
        }
        for (int j = i; j < curLen -1; j++) {
            listElem[j] = listElem[j + 1];
        }
        listElem[curLen -1] = null ;
        curLen--;


    }


    @Override
    public int indexOf(Object x) {
        for (int i = 0; i < curLen; i++) {
            if (listElem[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void display() {
        if(listElem == null || listElem.length < 1){
            return;
        }
        for (int i = 0; i < curLen;i++) {
            if(listElem[i] != null){
                System.out.println(listElem[i]);
            }
        }
    }

    @Override
    public void add(T o) {
        if(curLen  == 0 ){
            listElem[0] = o ;
            curLen ++;
            return;
        }
        listElem[curLen] = o;
        curLen ++ ;



    }

    @Override
    public void remove(T o) {
        if(curLen <= 0){
            return;
        }
        int temp = 0;
        for(int i =0; i< curLen; i++){
            if(listElem[i].equals(o)){
                temp = i ;
                break;
            }
        }
        for (int j = temp; j < curLen -1; j++) {
            listElem[j] = listElem[j + 1];
        }
        listElem[curLen -1] = null ;
        curLen -- ;
    }

    public SxList(int maxSize) {
        curLen = 0;
        listElem = new Object[maxSize];
    }

    public SxList() {
        curLen = 0;
        listElem =  new Object[DEFAULT_SIZE];
    }




}
