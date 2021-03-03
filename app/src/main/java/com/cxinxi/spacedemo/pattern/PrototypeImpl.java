package com.cxinxi.spacedemo.pattern;

public class PrototypeImpl implements  Cloneable{

    private  String name;

    public void setId(String id) {
        this.id = id;
    }

    private  String  id;
    private  int age ;


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


    public PrototypeImpl() {}
    public PrototypeImpl clone() throws CloneNotSupportedException {
        return (PrototypeImpl)super.clone();
    }

    @Override
    public String toString() {
        return "PrototypeImpl{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
