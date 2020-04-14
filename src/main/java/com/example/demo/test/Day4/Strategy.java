package com.example.demo.test.Day4;

public  interface Strategy {
    String approach(String msg);
}
class Soft implements Strategy{
    @Override
    public String approach(String msg) {
        return msg.toLowerCase() + "?";
    }
}
class Unrelated{
    static String twice(String msg){
        return msg + " " + msg ;
    }
}

