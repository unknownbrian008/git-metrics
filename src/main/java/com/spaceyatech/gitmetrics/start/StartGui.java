package com.spaceyatech.gitmetrics.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spaceyatech.gitmetrics.helper.SomeHelper;

import jakarta.annotation.PostConstruct;

@Component
public class StartGui {

    // The Classloader scanned the class path and found a class called SomeHelperImpl and 
    // instantiated it and injected it here as a singleton.  If some where else has a SomeHelper
    // and @Autowired annotation it will also inject there.
    @Autowired
    private SomeHelper someHelper;

    @PostConstruct( )
    public void start() {

        System.out.println( "********** StartGUI.start() called" );

        // Here we call the injected SomeHelperImpl
        someHelper.doSomething();
    }
}
