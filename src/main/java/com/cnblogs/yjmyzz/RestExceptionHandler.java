package com.cnblogs.yjmyzz;

import javax.ws.rs.NotAllowedException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by yangjunming on 2017/4/26.
 */
@Provider
public class RestExceptionHandler implements ExceptionMapper<NotAllowedException> {

    @Override
    public Response toResponse(NotAllowedException e) {
        Response response = Response.status(Response.Status.METHOD_NOT_ALLOWED).entity(e.getMessage()).build();
        response.getHeaders().add("Content-Type", "text/plain");
        return response;
    }
}
