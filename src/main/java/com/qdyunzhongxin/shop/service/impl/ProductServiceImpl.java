package com.qdyunzhongxin.shop.service.impl;

import com.qdyunzhongxin.shop.entity.Product;
import com.qdyunzhongxin.shop.mapper.ProductMapper;
import com.qdyunzhongxin.shop.service.IProductService;
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
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
