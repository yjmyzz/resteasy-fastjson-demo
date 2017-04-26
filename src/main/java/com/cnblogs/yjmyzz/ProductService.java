package com.cnblogs.yjmyzz;

import javax.ws.rs.*;
import java.util.Date;

@Path("/product")
@Produces({"application/json; charset=GBK"})
public class ProductService {

    @GET
    @Path("/get")
    public Product getTest() {
        Product product = new Product();
        product.setName("苹果手机-GBK");
        product.setQty(999);
        product.setCreateTime(new Date());
        return product;
    }

    @POST
    @Path("/post")
    public Product postTest(@QueryParam("id") Integer id) {
        Product product = new Product();
        product.setName("TEST:" + id);
        product.setQty(999);
        product.setCreateTime(new Date());
        return product;
    }
}