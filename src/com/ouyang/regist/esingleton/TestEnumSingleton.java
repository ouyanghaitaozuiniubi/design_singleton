package com.ouyang.regist.esingleton;

import com.ouyang.lazy.innerclass.InnerSingleton;

public class TestEnumSingleton {

    public static void main(String[] args) {

            int k = 1000;
            for(int i = 0 ; i < k ; i++ ){
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(EnumSingleton.getInstance());
                    }
                }).start();
            }
        }


}
