package com.FaysalBinHasan;

public class TestSuper {

    public static void main(String[] args) {
        B b = new B();
    }
}

class A {
    A()
    {
        System.out.println("Inside A's constructor");
    }

//    A(int a) {
//        System.out.println("Inside A's constructor printing a=" + a);
//    }
}

class B extends A {

    B() {
       
        System.out.println("Inside B's constructor");
    }
}

