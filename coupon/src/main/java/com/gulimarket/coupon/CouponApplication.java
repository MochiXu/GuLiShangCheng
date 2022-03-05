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
 *
 *  使用nacos命名空间进行配置隔离
 *  1.可以根据微服务、环境（开发/测试/生产）进行隔离
 *  2.每个微服务之间相互隔离，可以仅加载自己命名空间下的所有配置文件
 *  3.配置集：所有配置的集合
 *  4.配置集ID：相当于配置文件名，类似于nacos的data id
 *  5.配置分组：GROUP，默认所有的配置集都属于DEFAULT_GROUP，类比namespace，语法是一样的
 *
 *  从nacos配置中心中同时加载多个配置集
 * */


@SpringBootApplication
@EnableDiscoveryClient
public class CouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(CouponApplication.class, args);
    }

}
