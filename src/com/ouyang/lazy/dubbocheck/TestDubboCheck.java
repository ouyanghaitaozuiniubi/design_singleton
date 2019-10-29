package com.ouyang.lazy.dubbocheck;

public class TestDubboCheck {
    public static void main(String[] args) {
        int k = 1000;
        for(int i = 0 ; i < k ; i++ ){

            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(DubboCheckSingleton.getInstance());
                }
            }).start();

        }

    }
}
