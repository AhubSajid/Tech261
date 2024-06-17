package com.sparta.ms;

public class Program {
    public static void main(String[] args) {
        int timeOfDay = 21;
        System.out.println(getGreeting(timeOfDay));
    }

    public static String getGreeting(int timeOfDay) {
        String greeting;
        if ((timeOfDay >= 0 && timeOfDay < 12) || timeOfDay == 24 ) {
            greeting = "Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            greeting = "Good afternoon!";
        } else if (timeOfDay > 18 && timeOfDay < 24) {
            greeting = "Good evening!";
        }
        else{
            greeting = "Invalid Time added. Please make sure your time is between 0-24";
        }
        return greeting;
    }
}
