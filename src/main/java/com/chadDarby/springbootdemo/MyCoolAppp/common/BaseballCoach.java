package com.chadDarby.springbootdemo.MyCoolAppp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//* Scope defines if the same bean instance is used across all injections(singleton)
// * Or a new bean instance is created every time (prototype)

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
 public class BaseballCoach implements Coach {

    //* Init method for bean (executed just after creation of bean)
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In init method of " + getClass().getSimpleName());
    }

    //* Destroy method for bean (executed just before destruction of bean)
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In destroy method of "+ getClass().getSimpleName());
    }

    public BaseballCoach(){
    System.out.println("In constructor : " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Bat like Babe Ruth";
    }
}
