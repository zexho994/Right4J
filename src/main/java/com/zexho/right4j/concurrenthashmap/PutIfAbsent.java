package com.zexho.right4j.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: 994
 * @Date: 2020/8/30 21:27
 */
public class PutIfAbsent {
    ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<>();

    public void putVal(){
        concurrentHashMap.putIfAbsent("first","one");
    }

    public String putValAndMapping(String key,String value){
        MyFunction myFunction = new MyFunction();
        myFunction.apply("function task -> " + value);
        concurrentHashMap.computeIfAbsent(key,myFunction);
        return concurrentHashMap.get(key);
    }

    public static void main(String[] args) {
        PutIfAbsent putIfAbsent = new PutIfAbsent();
        String result = putIfAbsent.putValAndMapping("first_key", "first_value");
        System.out.println(result);
    }
}
