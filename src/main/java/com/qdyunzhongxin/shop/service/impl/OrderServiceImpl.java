package com.qdyunzhongxin.shop.service.impl;

import com.qdyunzhongxin.shop.entity.Order;
import com.qdyunzhongxin.shop.mapper.OrderMapper;
import com.qdyunzhongxin.shop.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author rick
 * @since 2020-12-05
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
