package com.gulimarket.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.gulimarket.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author xmc
 * @email xmc1202@gmail.com
 * @date 2022-03-04 16:45:49
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

