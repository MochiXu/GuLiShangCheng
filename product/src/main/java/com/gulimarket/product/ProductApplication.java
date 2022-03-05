package com.gulimarket.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.整合MyBatis-Plus
 *     1-导入依赖(用于支持所有的Dao层)
 *     <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.5.1</version>
 *         </dependency>
 *     2-配置
 *         1-配置数据源
 *             1-导入数据库的驱动
 *             2-在application.yml中配置数据源信息
 *         2-配置MyBatis-Plus
 *             1-使用@MapperScan
 *             2-告诉MyBatis-Plus，sql映射文件的位置(即mapper接口的位置，mapper就是映射文件)
 *
 * */

@EnableDiscoveryClient
@MapperScan("com.gulimarket.product.dao")
@SpringBootApplication
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

}
