package com.example.demo.test.Day9;



public class demo2 {
    static class X {
        String f() {
            return "X::f()";
        }
    }

    interface MakeString {
        String make();
    }
    interface TransFormX{
        String transForm(X x);
    }

    public static void main(String[] args) {
        TransFormX sp = X::f;
        X x = new X();
        System.out.println(sp.transForm(x));
        System.out.println(x.f());
    }
}
