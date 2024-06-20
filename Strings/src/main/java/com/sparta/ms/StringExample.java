package com.sparta.ms;

public class StringExample {
    public static void main(String[] args) {
        String string1 = "Hello";
        string1 = string1.toUpperCase();

        System.out.println(string1.toCharArray());

        String string = String.valueOf(100);

        String name = "Manish";
        System.out.println("Hello " + name);
    }
}
