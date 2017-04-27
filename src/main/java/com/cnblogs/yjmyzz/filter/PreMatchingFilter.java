package com.cnblogs.yjmyzz.filter;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * Created by yangjunming on 2017/4/27.
 */
@Provider
@PreMatching
public class PreMatchingFilter implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        System.out.println("PreMatchingFilter=>" + containerRequestContext.getUriInfo().getPath(false));
    }
}
