package com.gulimarket.ware.dao;

import com.gulimarket.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author xmc
 * @email xmc1202@gmail.com
 * @date 2022-03-05 08:20:13
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
