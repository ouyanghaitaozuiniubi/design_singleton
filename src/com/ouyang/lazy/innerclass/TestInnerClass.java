package com.ouyang.lazy.innerclass;

import com.ouyang.lazy.dubbocheck.DubboCheckSingleton;

public class TestInnerClass {

    public static void main(String[] args) {
        int k = 1000;
        for(int i = 0 ; i < k ; i++ ){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(InnerSingleton.getInstance());
                }
            }).start();
        }
    }
}
