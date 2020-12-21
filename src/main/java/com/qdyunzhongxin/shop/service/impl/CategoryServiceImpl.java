package com.qdyunzhongxin.shop.service.impl;

import com.qdyunzhongxin.shop.entity.Category;
import com.qdyunzhongxin.shop.mapper.CategoryMapper;
import com.qdyunzhongxin.shop.service.ICategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
