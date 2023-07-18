package com.chadDarby.springbootdemo.MyCoolAppp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//* Component annotation makes this class a candidate for dependency injection and marks it as a spring bean
//* Primary annotation marks this bean as the default bean when multiple implementations of interface may exist
//* Lazy annotation is used for lazy initialization, bean is not initialized until required
@Component
//@Primary
@Lazy
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In constructor : " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        System.out.println("API HAS BEEN HIT");
        return "Practice fast bowling for 10 overs";
    }
}
