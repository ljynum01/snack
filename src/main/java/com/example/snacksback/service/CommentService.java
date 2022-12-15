package com.example.snacksback.service;

import com.example.snacksback.model.Comment;

public interface CommentService {
    public Boolean insetComment(Comment comment);

    public Boolean deleteComment(Integer id);
}
