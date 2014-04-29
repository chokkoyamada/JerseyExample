package com.kirishikistudios.jerseyexample;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * User: a12353
 * Date: 2014/04/29
 * Time: 19:15
 */
public class MyApplication extends ResourceConfig {

    public MyApplication() {
        packages("com.kirishikistudios.jerseyexample");
    }
}
