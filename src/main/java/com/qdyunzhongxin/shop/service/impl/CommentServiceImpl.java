package com.qdyunzhongxin.shop.service.impl;

import com.qdyunzhongxin.shop.entity.Comment;
import com.qdyunzhongxin.shop.mapper.CommentMapper;
import com.qdyunzhongxin.shop.service.ICommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
