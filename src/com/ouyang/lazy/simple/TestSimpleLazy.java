package com.ouyang.lazy.simple;

import com.ouyang.hungry.ExecTorThread;
import com.ouyang.hungry.Hungry;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class TestSimpleLazy {

    public static void main(String[] args) {
        Thread thread = new Thread(new ExecutorThread2());
        Thread thread1 = new Thread(new ExecutorThread2());
        thread.start();
        thread1.start();
        System.out.println("jjjj");
    }
        /*
        int time = 100;
        for(int i=0 ; i< time ; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(SimpleLazy.getInstance());
                }
            }).start();;
        }
    }*/



}
