package com.ouyang.hungry;

public class ExecTorThread implements  Runnable {
    @Override
    public void run() {
        Hungry hungry = Hungry.getInstance();
        System.out.println(hungry);
    }
}
