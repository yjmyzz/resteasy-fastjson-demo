package com.cnblogs.yjmyzz.service;

import com.alibaba.fastjson.JSON;
import com.cnblogs.yjmyzz.bean.Product;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import java.util.Date;

@Path("/product")
@Produces({"application/json;charset=GBK"})
public class ProductService {

    @GET
    @Path("/get")
    public Product getTest() {
        Product product = new Product();
        product.setName("苹果手机");
        product.setQty(100);
        product.setCreateTime(new Date());
        return product;
    }

    @POST
    @Path("/post")
    public Product postTest(@Context HttpServletRequest request, @QueryParam("id") Integer id, @FormParam("name") String name) {
        Product product = new Product();
        product.setId(id == null ? 0 : id);
        product.setName(name);
        product.setQty(200);
        product.setCreateTime(new Date());
        System.out.println(JSON.toJSON(request.getParameterMap()));
        return product;
    }
}