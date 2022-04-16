package com.luv2code.springdemo;

public class BaseballCoach implements ICoach {    

    @Override
    public String getDailyWorkout(){
        return "Spends 30 minutes on batting practice";
    }
}
