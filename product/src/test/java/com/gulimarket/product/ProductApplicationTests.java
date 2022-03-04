package com.gulimarket.product;

import com.gulimarket.product.dao.BrandDao;
import com.gulimarket.product.entity.BrandEntity;
import com.gulimarket.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
class ProductApplicationTests {

    //注入一个Service对象,这里使用的是IService封装的方法
    //实际上也可以注入mapper对象，mapper映射接口中也提供了很多方法
    //IService是对这些方法的进一步封装
    //见：https://www.cnblogs.com/andea/p/11601367.html BaseMapper和IService使用手册 🆚
    @Autowired
    private BrandService brandService;

    @Test
    private void myBatisPlusTest() {
        BrandEntity brandEntity=new BrandEntity();
        brandEntity.setDescript("这是XX商品信息");
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("brand对象保存成功");
    }

}
