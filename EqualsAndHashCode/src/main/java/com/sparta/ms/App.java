package com.sparta.ms;

public class App {
    public static void main(String[] args) {
        Spartan spartan1 = new Spartan("Manish", "Gadhvi");
        Spartan spartan2 = new Spartan("Manish", "Gadhvi");

        System.out.println(spartan1==spartan2); //false
        System.out.println(spartan1.equals(spartan2));//true because of overridden equals method
    }
}
