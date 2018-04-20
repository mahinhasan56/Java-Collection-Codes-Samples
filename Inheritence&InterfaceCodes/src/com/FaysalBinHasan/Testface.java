package com.FaysalBinHasan;

public class Testface {

    public static void main(String args[]) {
//Callback c1=new Callback();
//c1.callback(21);
        Client c2 = new Client();
        c2.callback(42);
        Callback c3 = new Client();
        c3.callback(84);
    }
}

interface Callback {

    void callback(int param);
}

class Client implements Callback {
// Implement Callback's interface

    public void callback(int p) {
        System.out.println("callback called with " + p);
    }
}
//Accessing Implementations
//through Interface References

