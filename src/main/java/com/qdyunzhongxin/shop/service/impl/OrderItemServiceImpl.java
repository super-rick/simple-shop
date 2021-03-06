package com.qdyunzhongxin.shop.service.impl;

import com.qdyunzhongxin.shop.entity.OrderItem;
import com.qdyunzhongxin.shop.mapper.OrderItemMapper;
import com.qdyunzhongxin.shop.service.IOrderItemService;
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
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements IOrderItemService {

}
