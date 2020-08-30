package com.zexho.right4j.concurrenthashmap;

import java.util.function.Function;

/**
 * @Author: 994
 * @Date: 2020/8/30 21:37
 */
public class MyFunction implements Function<String,String> {

    @Override
    public String apply(String t) {
        System.out.println("invoke MyFunction.apply()");
        return "result:" + t;
    }
}
