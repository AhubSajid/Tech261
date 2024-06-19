package com.sparta.ms.static_;

import java.util.ArrayList;

public class StaticBlockExample {
    private static ArrayList<String> name = new ArrayList<>();

    static { //block that is run once
        name.add("muhammad");
        name.add("alex");
    }

    public static void main(String[] args) {
        System.out.println(name);
    }
}
