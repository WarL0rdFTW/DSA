package com.rithik.staticExamples;

public class Human {


    int age;
    String name;
    int salary;
    boolean married;
    /**
     * static fields are independent of objects.
     */
    static int population=2;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        this.population += 1;
    }
}
