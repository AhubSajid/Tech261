package com.sparta.ms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    void palindromeReturnsTrue(){
        String stringIn = "dad";
        boolean result = App.palindrome(stringIn);
        Assertions.assertTrue(result);
    }
    @Test
    void nonPalindromeReturnsFalse(){
        String stringIn = "apple";
        boolean result = App.palindrome(stringIn);
        Assertions.assertFalse(result);
    }
    @Test
    void palindromeWithWhiteSpaceReturnsTrue(){
        String stringIn = "race car";
        boolean result = App.palindrome(stringIn);
        Assertions.assertTrue(result);
    }
    @Test
    void palindromeWithLessThanThreeCharactersReturnsFalse(){
        String stringIn = "to";
        boolean result = App.palindrome(stringIn);
        Assertions.assertFalse(result);
    }
}
