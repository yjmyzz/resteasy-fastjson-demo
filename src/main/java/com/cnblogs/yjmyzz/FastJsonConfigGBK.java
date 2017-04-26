package com.cnblogs.yjmyzz;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;

import java.nio.charset.Charset;

/**
 * Created by 菩提树下的杨过(http://yjmyzz.cnblogs.com/) on 2017/4/24.
 */
public class FastJsonConfigGBK extends FastJsonConfig {

    public FastJsonConfigGBK() {
        super();
        setCharset(Charset.forName("GBK"));
        setSerializerFeatures(SerializerFeature.DisableCircularReferenceDetect);
    }
}
