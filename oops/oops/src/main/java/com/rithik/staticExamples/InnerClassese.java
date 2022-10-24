package com.rithik.staticExamples;

/**
 * output in this case will be new Name ,new Name
 */
// class Test{
//
//   static String name;
//    public Test(String name) {
//        this.name = name;
//    }
//}
public class InnerClassese {

    /**
     * output in this case will be Rithik , new Name.
     */
    static class Test{


        String name;
        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Rithik");
        Test b = new Test("new name");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
