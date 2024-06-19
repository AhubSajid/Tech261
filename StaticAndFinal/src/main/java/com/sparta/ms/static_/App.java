package com.sparta.ms.static_;

public class App {
    public static void main(String[] args) {
        Spartan muhammad = new Spartan();
        Spartan alex = new Spartan();

        muhammad.setName("Muhammad");
        alex.setName("Alex");

        System.out.println(muhammad.getName());
        System.out.println(alex.getName());

        Spartan.printSpartan(muhammad);
        Spartan.printSpartan(alex);
    }
}
