package com.FaysalBinHasan;

public class CallingCons {

    public static void main(String[] agrs) {
        Z z = new Z();
    }
}



class X {

    X() {
        System.out.println("Inside X's constructor");
    }
}

class Y extends X {

    Y() {
        System.out.println("Inside Y's constructor");
    }
}

class Z extends Y {

    Z() {
        System.out.println("Inside Z's constructor");
    }
}

