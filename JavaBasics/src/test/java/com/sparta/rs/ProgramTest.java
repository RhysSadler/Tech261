package com.sparta.rs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProgramTest {
    @Test
    @DisplayName("given a time of 21, then the greeting should be Good Evening")
    void checkThat21GivesGoodEvening(){
        int time = 21;
        String exspectedGreeting = "Good evening!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(exspectedGreeting, actualGreeting);
    }
    @Test
    @DisplayName("given a time of 14, then the greeting should be Good afternoon!")
    void checkThat11GivesGoodAfternoon(){
        int time = 14;
        String exspectedGreeding = "Good afternoon!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(exspectedGreeding,actualGreeting);
    }

}

