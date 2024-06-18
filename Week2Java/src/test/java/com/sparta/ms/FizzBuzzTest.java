package com.sparta.ms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTest {
    //Print numbers in order - [DONE]
    //If number is divisible by 3 print Fizz - [DONE]
    //If number divisible by 5 print Buzz - [DONE]
    //If number divisible by both print FizzBuzz - [DONE]

    @Test
    void givenAnInputOfOneFizzBuzzReturnsOne(){
        int input = 1;
        String expected = "1";
        String actual = FizzBuzz.getFizzBuzzFromTwo(input);
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void givenInputOfThreeFizzBuzzReturnsFizz(int input){
        String expected = "Fizz";
        String actual = FizzBuzz.getFizzBuzzFromTwo(input);
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    void givenInputOfFiveFizzBuzzReturnsBuzz(int input){
        String expected = "Buzz";
        String actual = FizzBuzz.getFizzBuzzFromTwo(input);
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    void givenInputOfThreeAndFiveFizzBuzzReturnsFizzBuzz(int input){
        String expected = "FizzBuzz";
        String actual = FizzBuzz.getFizzBuzzFromTwo(input);
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource({"2, 2,", "4,4","7,7"})
    void givenInputNotDivisibleByFiveorThreeFizzBuzzReturnsThatNumber(int input, String expected){
        String actual = FizzBuzz.getFizzBuzzFromTwo(input);
        Assertions.assertEquals(expected,actual);
    }







}
