package org.acme;

import io.quarkus.security.ForbiddenException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ForbiddenExceptionMapper implements ExceptionMapper<ForbiddenException> {
    @Override
    public Response toResponse(ForbiddenException e) {
        return Response.ok(getClass().getSimpleName() + " " + e.getMessage()).build();
    }
}
