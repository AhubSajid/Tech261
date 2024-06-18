package com.sparta.ms;

public class FizzBuzz {

    public static String getFizzBuzzFrom(int number) {
        String fizzBuzzString = Integer.toString(number);
        if((number % 3 == 0) && (number % 5 == 0)){
            fizzBuzzString = "FizzBuzz";
        }
        else if (number % 3 == 0){
            fizzBuzzString = "Fizz";
        } else if (number % 5 == 0) {
            fizzBuzzString = "Buzz";
        }
        return fizzBuzzString;
    }

    public static String getFizzBuzzFromTwo(int number) {
        String fizzBuzzString = "";
         if (number % 3 == 0){
            fizzBuzzString += "Fizz";
        }
         if (number % 5 == 0) {
            fizzBuzzString += "Buzz";
        }
         if (fizzBuzzString.equals("")){
             fizzBuzzString = Integer.toString(number);
         }
        return fizzBuzzString;
    }
}
