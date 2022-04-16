package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    
    public static void main(String[] args) {
        // loade the spring config file
        ClassPathXmlApplicationContext context = 
            new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from container
        ICoach coach = context.getBean("myCoach", ICoach.class);
        // call methods on the bean
        System.out.println(coach.getDailyWorkout());
        // close context
        context.close();
    }
}
