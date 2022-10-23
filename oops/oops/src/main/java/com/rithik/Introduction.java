package com.rithik;

public class Introduction {

    public static void main(String[] args) {

        // add 5 roll no
        int[] rollno = new int[5];

        // add 5 names
        String[] names = new String[5];

        // add roll no , name , marks
        int[] roll = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        /**
         * Student std : this part execute during compile time.
         * new Student() : this part will happen during run time.
         * new Keyword represents dynamically allocates memory .
         * Student() : default Constructor which describe action to be
         *              taken when calling the object.
         */
        Student std = new Student();
        Student std1 = new Student(45,"Vikram Arora",87.56f);

//        std .rollno = 71;
//        std.name = "Rithik Sharma";
//        std.marks = 89.7f;

//        System.out.println(std.rollno);
//        System.out.println(std.name);
//        System.out.println(std.marks);
//        std.greeting();

        System.out.println(std1.rollno);
        System.out.println(std1.name);
        System.out.println(std1.marks);
        std1.greeting();
    }
}
/**
 * This is a class which will be used to create our own custom DataType
 * that will store our values.
 * Class is the collection of properties and functions.
 * Class is template of object and object is the instance of the class.
 *
 * Class = logical construct
 * object = physical reality / occupy space in memory.
 */
class Student{

    int rollno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Namaste! My name is " + name);
    }
    /**
     * we need a way to add the values of the above properties
     * object by object.
     *
     * we need one word to access every Object using "this" keyword.
     */
    Student(){
        this .rollno = 71;
        this.name = "Rithik Sharma";
        this.marks = 89.7f;
    }
    Student(int rollno,String name,float marks){
       this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

}
