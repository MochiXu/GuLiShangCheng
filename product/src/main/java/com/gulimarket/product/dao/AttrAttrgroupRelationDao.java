package com.gulimarket.product.dao;

import com.gulimarket.product.entity.AttrAttrgroupRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 属性&属性分组关联
 * 
 * @author xmc
 * @email xmc1202@gmail.com
 * @date 2022-03-04 16:45:49
 */

    //Mapper接口，相当于以前的Dao，直接继承 BaseMapper，这是 mybatis-plus 封装好的类。
    //BaseMapper里面封装了一些常见的CRUD方法
    //直接继承BaseMapper能够省去一些sql的编写，当然也可以直接在xml中编写sql语句

@Mapper
public interface AttrAttrgroupRelationDao extends BaseMapper<AttrAttrgroupRelationEntity> {
	
}
