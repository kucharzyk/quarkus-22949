package org.acme;

import io.quarkus.security.ForbiddenException;
import io.quarkus.security.UnauthorizedException;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class TestResource {

    @GET
    @Path("/a")
    @Produces(MediaType.TEXT_PLAIN)
    public String unauthorizedException() {
        throw new UnauthorizedException("UnauthorizedException");
    }

    @GET
    @Path("/b")
    @Produces(MediaType.TEXT_PLAIN)
    public String forbiddenException() {
        throw new ForbiddenException("ForbiddenException");
    }

    @GET
    @Path("/c")
    @Produces(MediaType.TEXT_PLAIN)
    public String notFoundException() {
        throw new NotFoundException("NotFoundException");
    }
}