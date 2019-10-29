package com.ouyang.lazy.simple;

import com.ouyang.hungry.Hungry;

public class ExecutorThread2 implements  Runnable {
    @Override
    public void run() {
        SimpleLazy lazy = SimpleLazy.getInstance();
        System.out.println(Thread.currentThread().getName() + lazy);
    }
}
