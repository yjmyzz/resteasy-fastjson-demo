package com.cnblogs.yjmyzz;

import com.alibaba.fastjson.support.jaxrs.FastJsonProvider;

/**
 * Created by 菩提树下的杨过(http://yjmyzz.cnblogs.com/) on 2017/4/24.
 */
public class FastJsonProviderGBK extends FastJsonProvider {

    public FastJsonProviderGBK() {
        super();
        setFastJsonConfig(new FastJsonConfigGBK());
    }
}
