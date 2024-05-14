package org.example.inheritance;

public class ChildA extends ParentA{

    private String str1;
    public String str2;
    protected String str3;
    String str4;

    public static int i = 20;

    public ChildA() {
        System.out.println("Child Constructor");
    }

    public String hello() {
        return "Hello Child";
    }

    public String bye() {
        return "Bye Child";
    }
}
