package com.chadDarby.springbootdemo.MyCoolAppp.common;

//* Not using component annotation here, will use config file to create bean for objects of this class
public class SwimCoach implements Coach{

    public SwimCoach (){
        System.out.println("In constructor : " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim like Michael Phelps";
    }
}
