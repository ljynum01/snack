package com.example.snacksback.service.impl;

import com.example.snacksback.mapper.CommentMapper;
import com.example.snacksback.model.Comment;
import com.example.snacksback.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentMapper commentMapper;

    @Override
    public Boolean insetComment(Comment comment) {
        int insert = commentMapper.insertSelective(comment);
        return insert>0;
    }

    @Override
    public Boolean deleteComment(Integer id) {
        int i = commentMapper.deleteByPrimaryKey(id);
        return i>0;
    }
}
