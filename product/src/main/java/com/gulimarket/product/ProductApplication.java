package com.gulimarket.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.整合MyBatis-Plus
 *     1-导入依赖
 *     2-配置
 *         1-配置数据源
 *             1-导入数据库的驱动
 *         2-配置MyBatis-Plus
 *
 * */



@SpringBootApplication
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

}
