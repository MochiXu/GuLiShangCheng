package com.gulimarket.member.feign;

import com.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//配置远程调用微服务端的名称（该名称与此微服务在配置文件中配置的名字一致）
@FeignClient("gulimarket-coupon")
public interface CouponFeignService {
    //映射路径必须是跟路径开始去访问的路径
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
