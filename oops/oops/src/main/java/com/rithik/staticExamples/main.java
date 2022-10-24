package com.rithik.staticExamples;


public class main {
    public static void main(String[] args) {

//        Human rithik = new Human(22,"Rithik Sharma",15000,false);
//        Human newHuman = new Human(45,"new Human",10000,true);
//        Human newHuman2 = new Human(45,"new Human2",10000,true);

        System.out.println(Human.population);


        //System.out.println(rithik.name);
        fun();
    }

    /**
     * you cannot call a non-static method inside static method.
     * to call non-static method in static method make the non-static
     * method static or use the instance of the class.
     */
    static void fun(){
        //greeting();     can't use this as it is non-static
        main obj = new main();
        obj.greeting();

    }

    static void print(String name){
       // System.out.println("My name is +", this.name); // we can't use "this" keyword in static function/
    }
    /**
     * here it will be called easily as it is a non-static function so it can call either a static method
     * or a non-static method with in it
     */

    void fun2(){
        greeting();
    }

   static void greeting(){
        System.out.println("hello World");
    }


}
