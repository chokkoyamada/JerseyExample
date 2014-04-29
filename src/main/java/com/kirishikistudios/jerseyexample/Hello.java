package com.kirishikistudios.jerseyexample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * User: a12353
 * Date: 2014/04/29
 * Time: 16:39
 */
@Path("/hello")
public class Hello {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/world")
    public String sayHello(){
        return "Hello, world.";
    }
}
