package com.zexho.right4j.threadlocal;

/**
 * @Author: 994
 * @Date: 2020/8/29 17:04
 */
public class MyThreadLocal {
    // 存储随机数
    public static ThreadLocal<Double> randomLocal = ThreadLocal.withInitial(() -> null);

    //存储用户名
    public static ThreadLocal<String> userNameLocal = ThreadLocal.withInitial(()->null);
}
