package com.cnblogs.yjmyzz.fastjson;

import com.alibaba.fastjson.support.jaxrs.FastJsonProvider;

import javax.ws.rs.ext.Provider;

/**
 * Created by 菩提树下的杨过(http://yjmyzz.cnblogs.com/) on 2017/4/24.
 */
@Provider
public class FastJsonProviderGBK extends FastJsonProvider {

    public FastJsonProviderGBK() {
        super();
        setFastJsonConfig(new FastJsonConfigGBK());
    }
}
