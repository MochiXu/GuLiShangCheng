package com.gulimarket.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 1.member微服务想要调用别的微服务
 *     1.引入open-Feign
 *     2.写一个Feign包，在包里面去编写接口，告诉SpringCloud这个接口需要调用的远程服务 ‼️
 *         ‼️接口写法‼️: 声明接口的每一个方法都是调用对应远程服务的那个请求
 *     3.开启远程调用功能（注解@EnableFeignClients）
 * */
@EnableFeignClients(basePackages = "com.gulimarket.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class MemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }

}
