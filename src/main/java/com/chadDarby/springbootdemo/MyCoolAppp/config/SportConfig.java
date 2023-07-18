package com.chadDarby.springbootdemo.MyCoolAppp.config;

import com.chadDarby.springbootdemo.MyCoolAppp.common.Coach;
import com.chadDarby.springbootdemo.MyCoolAppp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean(name = "aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
