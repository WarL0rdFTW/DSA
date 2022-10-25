package com.rithik.inheritenceExamples;

public class BoxWeight extends Box{

    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); //Calls the parent constructor
        this.weight = weight;
    }
}
