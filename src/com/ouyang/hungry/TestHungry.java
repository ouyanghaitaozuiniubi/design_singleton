package com.ouyang.hungry;

public class TestHungry {
    public static void main(String[] args) {
       int time = 10000;
       for(int i=0 ; i< time ; i++){
           new Thread(new Runnable() {
               @Override
               public void run() {
                   System.out.println(Hungry.getInstance());
               }
           }).start();;
       }
    }
}
