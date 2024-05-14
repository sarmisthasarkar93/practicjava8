package org.example.inheritance;

public class ParentA {

    private String str1;
    public String str2;
    protected String str3;
    String str4;

    public static  int i = 10;

    public ParentA() {
        System.out.println("Parent Constructor");
    }

    public String hello() {
        return "Hello Parent";
    }

    public String bye() {
        return "Bye Parent";
    }
}
