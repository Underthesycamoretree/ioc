package com.dk;

import com.dk.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dun.kun
 * @version 1.0
 * @description: TODO
 * @date 2023/10/27 14:31
 */
public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConText.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService.getUdao());
    }
}
