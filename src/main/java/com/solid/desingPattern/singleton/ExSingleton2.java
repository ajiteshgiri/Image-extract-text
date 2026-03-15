package com.solid.desingPattern.singleton;

public class ExSingleton2 {

    private  static ExSingleton2 esg  = new ExSingleton2();
    public static ExSingleton2 getEsg(){
        return esg;
    }
}
