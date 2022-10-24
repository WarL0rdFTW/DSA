package com.rithik.staticExamples;

//this is a demo to show initialisation of static variables
public class staticBlocks {

    static int a = 4;
    static int b;

// will only run once, when the first obj is created i.e. when the class
    // is loaded.
    static{
        System.out.println("I am in static block");
        b = a*10;
    }

    public static void main(String[] args) {
        staticBlocks obj = new staticBlocks();
        System.out.println(obj.a + " "+ obj.b);
        obj.b += 3;

        staticBlocks obj2 = new staticBlocks();
        System.out.println(obj2.a + " " + obj2.b);
    }
}
