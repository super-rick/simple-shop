package com.qdyunzhongxin.shop.service.impl;

import com.qdyunzhongxin.shop.entity.Cart;
import com.qdyunzhongxin.shop.mapper.CartMapper;
import com.qdyunzhongxin.shop.service.ICartService;
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
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements ICartService {

}
