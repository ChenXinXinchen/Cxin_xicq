package com.cxinxi.spacedemo.pattern;

public abstract class Abstraction {
    protected Implementor impl;

    public Abstraction(Implementor impl) {
        this.impl = impl;
    }

    public abstract void Operation();
}

