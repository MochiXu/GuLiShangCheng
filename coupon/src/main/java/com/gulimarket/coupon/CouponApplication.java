package com.gulimarket.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 使用nacos作为配置中心，统一管理配置文件
 * 1.引入依赖
 * 2.创建一个bootstrap.properties（应用启动的时候首先会加载）
 * 3.给nacos配置中心默认添加一个数据集Data Id默认规则：应用名.properties
 * 4.在nacos配置中心使用应用名.properties进行配置
 * 5.动态获取配置
 *  @RefreshScope:动态获取并刷新配置
 *  @Value("${配置项名}"):获取到配置
 * */


@SpringBootApplication
@EnableDiscoveryClient
public class CouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(CouponApplication.class, args);
    }

}
