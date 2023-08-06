package com.spaceyatech.gitmetrics.helper;

import org.springframework.stereotype.Component;

@Component
public class SomeHelperImpl implements SomeHelper {

    @Override
    public void doSomething() {

        System.out.println( "********* Did something" );

    }
}
