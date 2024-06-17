package com.sparta.rs;
// read , maintain, test - needs for factorisation.
public class Program {
    public static void main(String[] args) throws preOrPast24HoursException {
        int timeOfDay = 25;
        after24Hours(timeOfDay);
        System.out.println(getGreeting(timeOfDay));

    }
    public static void after24Hours (int timeOfDay) throws preOrPast24HoursException {
        if (timeOfDay > 24){
            throw new preOrPast24HoursException();
        }
    }

    public static void pre24Hours (int timeOfDay) throws preOrPast24HoursException {
        if (timeOfDay < 0){
            throw new preOrPast24HoursException();
        }
    }


    public static String getGreeting(int timeOfDay) {
        String greeting;
        if (timeOfDay >= 5 && timeOfDay <= 12) {
            greeting = "Good morning!";
        } else if (timeOfDay >= 13 && timeOfDay <= 18) {
            greeting = "Good afternoon!";
        } else {
            greeting = "Good evening!";
        }
        return greeting;
    }
}
