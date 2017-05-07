package com.restEasy3.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 

@Path("/teste")
public class HelloResource 
{
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Hello getConfigurations() {
         return new Hello();
    }
}