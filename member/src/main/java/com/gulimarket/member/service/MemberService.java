package com.gulimarket.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.gulimarket.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author xmc
 * @email xmc1202@gmail.com
 * @date 2022-03-05 08:12:35
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

