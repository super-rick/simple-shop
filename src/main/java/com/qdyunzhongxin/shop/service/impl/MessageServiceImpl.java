package com.qdyunzhongxin.shop.service.impl;

import com.qdyunzhongxin.shop.entity.Message;
import com.qdyunzhongxin.shop.mapper.MessageMapper;
import com.qdyunzhongxin.shop.service.IMessageService;
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
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements IMessageService {

}
