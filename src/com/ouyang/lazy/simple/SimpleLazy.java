package com.ouyang.lazy.simple;

public class SimpleLazy {

    private SimpleLazy() {
    }
    private static SimpleLazy lazy = null;

    public static SimpleLazy getInstance(){
        if(lazy == null){
            lazy = new SimpleLazy();
        }
        return lazy;
    }




}
