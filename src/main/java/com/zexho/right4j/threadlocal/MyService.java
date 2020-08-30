package com.zexho.right4j.threadlocal;

import org.springframework.stereotype.Service;

/**
 * @Author: 994
 * @Date: 2020/8/29 16:45
 */
@Service
public class MyService {

    public void doSomething(){
        double newNum = MyThreadLocal.randomLocal.get();
        String newUser = MyThreadLocal.userNameLocal.get();

        System.out.println("newUser : " + newNum);
        System.out.println("newNum : " + newUser);
    }

}
