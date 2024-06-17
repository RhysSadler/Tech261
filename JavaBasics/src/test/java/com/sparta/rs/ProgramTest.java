package com.sparta.rs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProgramTest {
    @Test
    @DisplayName("given a time of 21, then the greeting should be Good Evening")
    void checkThat21GivesGoodEvening(){
        int time = 21;
        String expectedGreeting = "Good evening!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }
    @Test
    @DisplayName("given a time of 14, then the greeting should be Good afternoon!")
    void checkThat11GivesGoodAfternoon(){
        int time = 14;
        String expectedGreeting = "Good afternoon!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting,actualGreeting);
    }
    @Test
    public void testAfter24Hours_throwsExceptionForTimeGreaterThan24() {
        Exception exception = assertThrows(preOrPast24HoursException.class, () -> {
            Program.after24Hours(25);
        });
        assertNotNull(exception);
    }

    @Test
    public void testAfter24Hours_throwsExceptionForTimeLessThan0() {
        Exception exception = assertThrows(preOrPast24HoursException.class, () -> {
            Program.pre24Hours(-1);
        });
        assertNotNull(exception);
    }

    @Test
    public void testAfter24Hours_doesNotThrowExceptionForValidTime() {
        assertDoesNotThrow(() -> {
            Program.after24Hours(12);
        });
    }





}

