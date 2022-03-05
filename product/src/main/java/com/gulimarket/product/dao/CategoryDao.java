package com.gulimarket.product.dao;

import com.gulimarket.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xmc
 * @email xmc1202@gmail.com
 * @date 2022-03-04 16:45:49
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
