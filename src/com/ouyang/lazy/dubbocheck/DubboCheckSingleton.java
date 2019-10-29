package com.ouyang.lazy.dubbocheck;

public class DubboCheckSingleton {

    private static DubboCheckSingleton dubboChekSingleton;

    private DubboCheckSingleton() {
    }
    public static DubboCheckSingleton getInstance(){
        if(dubboChekSingleton == null){
            synchronized(DubboCheckSingleton.class){
                if(dubboChekSingleton == null){
                    dubboChekSingleton =  new DubboCheckSingleton();
                }
            }
        }
        return dubboChekSingleton;
    }
}
