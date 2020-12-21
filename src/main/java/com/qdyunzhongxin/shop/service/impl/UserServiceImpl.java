package com.qdyunzhongxin.shop.service.impl;

import com.qdyunzhongxin.shop.entity.User;
import com.qdyunzhongxin.shop.mapper.UserMapper;
import com.qdyunzhongxin.shop.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
