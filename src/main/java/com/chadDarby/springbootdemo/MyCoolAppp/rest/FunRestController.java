package com.chadDarby.springbootdemo.MyCoolAppp.rest;

//* Rest Controller class

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

    //* Enpoint to use custom properties defined above

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



}
