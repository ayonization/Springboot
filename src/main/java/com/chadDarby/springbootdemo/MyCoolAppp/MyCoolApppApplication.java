package com.chadDarby.springbootdemo.MyCoolAppp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//* By default, spring boot will only scan components from the main Springboot
//* application class and its sub-packages (all packages in MyCoolApp)
//		(
//		scanBasePackages = {"com.chadDarby.springbootdemo.MyCoolAppp",
//		"com.chadDarby.springbootdemo.util"}
//)
public class MyCoolApppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCoolApppApplication.class, args);
	}

}
