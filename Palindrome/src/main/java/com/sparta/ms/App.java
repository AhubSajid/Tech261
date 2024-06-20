package com.sparta.ms;

public class App {
    public static boolean palindrome(String inString){
        inString = inString.replaceAll("\\s", "");
        inString = inString.toLowerCase();
        StringBuilder string1 = new StringBuilder(inString);
        string1.reverse();

        if( inString.length() >= 3 && inString.equals(string1.toString())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("Race car"));
    }
}
