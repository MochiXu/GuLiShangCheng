package com.gulimarket.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.gulimarket.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author xmc
 * @email xmc1202@gmail.com
 * @date 2022-03-04 16:45:49
 */

//通用IService--进一步封装：采用 get 查询单行, remove 删除, list 查询集合, page 分页
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {
    //queryPage是按照分页进行查询
    PageUtils queryPage(Map<String, Object> params);
}

