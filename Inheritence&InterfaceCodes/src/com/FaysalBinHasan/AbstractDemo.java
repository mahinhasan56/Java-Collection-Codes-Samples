package com.FaysalBinHasan;

public class AbstractDemo {

    public static void main(String args[]) {
        B b = new B();
        b.callme();
        b.callmetoo();
    }
}


abstract class A {

    abstract void callme();

    //concrete methods are allowed in abstract class
    void callmetoo() {
        System.out.println("This is a concrete method");
    }
}

class B extends A {
//overridecallme()

    void callme() {
        System.out.println("Inside B's callme method");
    }
}

