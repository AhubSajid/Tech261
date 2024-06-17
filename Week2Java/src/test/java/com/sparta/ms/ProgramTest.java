package com.sparta.ms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProgramTest {
    @Test
    @DisplayName("Given time of 21, the greeting should be Good Evening!")
    void checkThat21GivesGoodEvening(){
        int time = 21;
        String expectedGreeting = "Good evening!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting,actualGreeting);
    }

    @Test
    @DisplayName("Given time of 0, the greeting should be Good Morning!")
    void checkThat0GivesGoodMorning(){
        int time = 0;
        String expectedGreeting = "good morning!";
        String actualGreeting = Program.getGreeting(time).toLowerCase();
        Assertions.assertEquals(expectedGreeting,actualGreeting);
    }

    @Test
    @DisplayName("Given time of 24, the greeting should be Good Morning!")
    void checkThat24GivesGoodMorning(){
        int time = 24;
        String expectedGreeting = "good morning!";
        String actualGreeting = Program.getGreeting(time).toLowerCase();
        Assertions.assertEquals(expectedGreeting,actualGreeting);
    }

    @Test
    @DisplayName("Given time of 11, the greeting should be Good Morning!")
    void checkThat11GivesGoodMorning(){
        int time = 11;
        String expectedGreeting = "good morning!";
        String actualGreeting = Program.getGreeting(time).toLowerCase();
        Assertions.assertEquals(expectedGreeting,actualGreeting);
    }

    @Test
    @DisplayName("Given time of 12, the greeting should be Good Afternoon!")
    void checkThat12GivesGoodAfternoon(){
        int time = 12;
        String expectedGreeting = "good afternoon!";
        String actualGreeting = Program.getGreeting(time).toLowerCase();
        Assertions.assertEquals(expectedGreeting,actualGreeting);
    }
    @Test
    @DisplayName("Given time of 18, the greeting should be Good Afternoon!")
    void checkThat18GivesGoodAfternoon(){
        int time = 18;
        String expectedGreeting = "good afternoon!";
        String actualGreeting = Program.getGreeting(time).toLowerCase();
        Assertions.assertEquals(expectedGreeting,actualGreeting);
    }
    @Test
    @DisplayName("Given time of 19, the greeting should be Good Evening!")
    void checkThat19GivesGoodEvening(){
        int time = 19;
        String expectedGreeting = "good evening!";
        String actualGreeting = Program.getGreeting(time).toLowerCase();
        Assertions.assertEquals(expectedGreeting,actualGreeting);
    }
    @Test
    @DisplayName("Given time of 23, the greeting should be Good Evening!")
    void checkThat23GivesGoodEvening(){
        int time = 23;
        String expectedGreeting = "good evening!";
        String actualGreeting = Program.getGreeting(time).toLowerCase();
        Assertions.assertEquals(expectedGreeting,actualGreeting);
    }
    @Test
    @DisplayName("Given time of 21, a greeting should be returned")
    void checkThat21ReturnsGreeting(){
        int time = 21;
        String returnedGreeting = Program.getGreeting(time);
        Assertions.assertFalse(returnedGreeting.isEmpty());
    }
}
