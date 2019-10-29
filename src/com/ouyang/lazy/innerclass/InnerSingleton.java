package com.ouyang.lazy.innerclass;

import java.lang.reflect.InvocationHandler;

public class InnerSingleton {

    private InnerSingleton() {
        if(InnerHold.lazy != null) {
            throw new RuntimeException("lalalException");
        }
    }

    private static   final class  InnerHold{

    private static InnerSingleton  lazy = new InnerSingleton();

    }
    public  static InnerSingleton getInstance(){
        return InnerHold.lazy;
    }



}
