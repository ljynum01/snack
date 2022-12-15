package com.example.snacksback.controller;

import com.example.snacksback.model.Comment;
import com.example.snacksback.service.CommentService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@Api(tags = "商品评论接口")
@RequestMapping("/comment")
public class CommentController {
    @Resource
    private CommentService commentService;

    @PostMapping("/insert")
    public Boolean insert(@RequestBody Comment comment) {
        Date date = new Date();
        comment.setPtime(date);
        Boolean aBoolean = commentService.insetComment(comment);
        return aBoolean;
    }

    @GetMapping("/delete")
    public Boolean delete(Integer id) {
        Boolean aBoolean = commentService.deleteComment(id);
        return aBoolean;
    }
}
