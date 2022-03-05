package com.gulimarket.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.gulimarket.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author xmc
 * @email xmc1202@gmail.com
 * @date 2022-03-05 08:20:13
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

