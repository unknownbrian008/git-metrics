package com.spaceyatech.gitmetrics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitmetricsApplication {

    public static void main( String[] args ) {

        // This is where the Spring Boot application is initialised.  It scans the class path
        // and looks for @Autowired and injects all the classes.
        //
        // Note that in StartGui we have a class with a method annotated with @PostConstruct.  
        // That method gets called when everything has been injected.
        SpringApplication.run( GitmetricsApplication.class, args );
    }
}
