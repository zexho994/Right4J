package com.zexho.right4j.threadlocal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Author: 994
 * @Date: 2020/8/29 16:24
 */
@RequestMapping("/api")
@RestController
public class ThreadLocalController {

    @Autowired
    MyService myService;

    @GetMapping("/threadLocal/{name}")
    public String getThreadLocalVariables(@PathVariable String name) {
        // 获取线程threadlocal的值
        Double oldNum =  MyThreadLocal.randomLocal.get();
        String oldUser = MyThreadLocal.userNameLocal.get();

        // 打印
        System.out.println("oldNum : " + oldNum);
        System.out.println("oldUser : " + oldUser);

        // 获取随机数
        Random random = new Random();
        double num = random.nextDouble();

        // 赋值
        MyThreadLocal.randomLocal.set(num);
        MyThreadLocal.userNameLocal.set(name);

        myService.doSomething();

        return "ok";
    }
}
