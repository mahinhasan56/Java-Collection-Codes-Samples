package com.FaysalBinHasan;

public class Override {

    public static void main(String args[]) {
        B subOb = new B(1, 2, 3);
        subOb.show();
    }
}


class A {

    int i, j;

    public A(int a, int b) {
        i = a;
        j = b;

    }

    //display i and j 
    void show() {
        System.out.println("i and j " + i + " " + j);
    }
}

class B extends A {

    int k;

    public B(int a, int b, int c) {
        super(a, b);
        k = c;

    }

    void show() {
        System.out.println("k " + k);
    }
}

