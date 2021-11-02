package com.neka;

class A{
    public void show(){
        System.out.println("CLASS A");
    }
}

class B extends A {
    public void show() {
        System.out.println("CLASS B");
    }

    //creating method 2 :
    public void config(){
        System.out.println("Config B in class B");
    }
}
class C extends A {
    public void show() {
        System.out.println("CLASS C");
    }
}
public class Main {

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        //o/p : CLASS B

        A obj1 = new B(); //runtime polymorphism
        obj1.show();

        //o/p : CLASS B -->we are calling the method of B as obj is created for b
        //here class is A reference and B is object
        //as A is the super class and B is the sub class


        /*obj1.config();   --->this will throw error as config is not implemented in class A
            to overcome this we can either use
            B obj1 = new B();
            (or)
            create config in class A
         */

        obj1 = new C();  //dynamic method dispatch -->
        obj1.show();
        //o/p : CLASS C

        //types of polymorphism:
        //compile time and run time

        //the linking of the object is done at run time
        //so only in the run time it decides which object to call

        //dynamic method dispatch -we need runtime poly to make this work

    }
}
