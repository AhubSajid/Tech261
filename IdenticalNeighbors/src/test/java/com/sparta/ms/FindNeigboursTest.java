package com.sparta.ms;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindNeigboursTest {

    @Test
    void givenArrayWithThreeSameConsecutiveValuesValuesReturnsTrue(){
        int[] input = {2,3,3,3,5,7};
        boolean expected = true;
        boolean actual = App.findNeighbors(input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void givenArrayNotWithThreeSameConsecutiveValuesValuesReturnsFalse(){
        int[] input = {2,3,2,3,5,7};
        boolean expected = false;
        boolean actual = App.findNeighbors(input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void givenArrayWithSingleValueReturnsFalse(){
        int[] input = {2};
        boolean expected = false;
        boolean actual = App.findNeighbors(input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void givenArrayWithThreeSameConsecutiveValuesTwiceReturnsTrue(){
        int[] input = {2,3,3,3,5,7,7,7};
        boolean expected = true;
        boolean actual = App.findNeighbors(input);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void givenEmptyArrayReturnsFalse(){
        int[] input = {};
        boolean expected = false;
        boolean actual = App.findNeighbors(input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void givenNegativeValuesButSameNumberReturnsFalse(){
        int[] input = {2,3,-3,3,7};
        boolean expected = false;
        boolean actual = App.findNeighbors(input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void givenThreeNegativeValuesConsecutiveReturnsTrue(){
        int[] input = {2,-3,-3,-3,7};
        boolean expected = true;
        boolean actual = App.findNeighbors(input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void givenNullArrayReturnsFalse(){
        int[] input = null;
        boolean expected = false;
        boolean actual = App.findNeighbors(input);
        Assertions.assertEquals(expected,actual);
    }


}
