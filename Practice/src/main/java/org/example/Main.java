package org.example;

import org.example.inheritance.ChildA;
import org.example.inheritance.ParentA;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ParentA parentA = new ParentA();
        System.out.println(parentA.hello());
        System.out.println(parentA.i);//10
        System.out.println("1");
        ParentA parentA1 = new ChildA();
        System.out.println(parentA1.hello());
        System.out.println(parentA1.bye());
        System.out.println(parentA1.i);//10
        System.out.println("2");
        ChildA childA = new ChildA();
        System.out.println(childA.hello());
        System.out.println(childA.bye());
        System.out.println(childA.i);//20
        System.out.println("3");
       // ChildA childA1 = (ChildA) new ParentA();
        //childA1.hello();

    }
}