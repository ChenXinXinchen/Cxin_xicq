package com.cxinxi.spacedemo.pattern;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    public void Operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        impl.OperationImpl();
    }
}