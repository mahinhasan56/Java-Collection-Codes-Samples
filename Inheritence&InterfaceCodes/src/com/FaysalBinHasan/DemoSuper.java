package com.FaysalBinHasan;

public class DemoSuper {

    public static void main(String args[]) {
       BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
       BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
       BoxWeight mybox3 = new BoxWeight();
       BoxWeight mycube = new BoxWeight(3, 2);
       BoxWeight myclone = new BoxWeight(mybox1);
    }
}


class Box {

    double width, height, depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = height = depth = -1;
        
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {

    double weight;//weightofbox

    BoxWeight(BoxWeight ob) {
        //super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight() {
        super();//must be the 1st statement in constructor

        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}


