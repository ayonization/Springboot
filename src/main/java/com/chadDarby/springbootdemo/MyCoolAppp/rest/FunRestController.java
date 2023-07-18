package com.chadDarby.springbootdemo.MyCoolAppp.rest;

//* Rest Controller class

import com.chadDarby.springbootdemo.MyCoolAppp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //* Inject custom properties from application.properties file
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //* Endpoint to use custom properties defined above

    @GetMapping("/teaminfo")
    public String getTeamInfo(){

        return "Coach name is " + coachName + " team name is " + teamName;
    }
    //* Expose "/" to return "Hello World"
    @GetMapping("/")
    public String sayHello(){

        return "Hello World";
    }

    //* Expose new endpoint for workout
    @GetMapping("/workout")
    public String workout(){
        return "Run a hard 5k";
    }

    //! Dependency injection and IOC

    //! Constructor injection

    //* Define a private field for the dependency
    private Coach myCoach;

    private Coach anotherCoach;

    //* Define a constructor for dependency injection (constructor injection)

    //* Autowired tells spring to inject the dependency

    //* Qualifier specifies which bean to use when multiple implementations of Coach interface exist
    @Autowired
    public FunRestController(@Qualifier("aquatic") Coach theCoach,
                             @Qualifier("baseballCoach") Coach theAnotherCoach){
        System.out.println("In constructor : " + getClass().getSimpleName());

        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    //*  Exposing endpoint to access methods in the Coach interface
    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }


    //* Endpoint to check bean scope (singleton or not)
    @GetMapping("/check")
    public String check(){
        return "myCoach == anotherCoach " + (myCoach == anotherCoach);
    }

    //! Setter injection

//    private Coach myCoach;
//
//    @Autowired
//    public void setCoach(Coach theCoach){
//        myCoach = theCoach;
//    }
//
//    @GetMapping("/dailyWorkout")
//    public String getDailyWorkout(){
//        return myCoach.getDailyWorkout();
//    }
}
