package com.v1ntage.marketplace.comment;

import com.v1ntage.marketplace.province.Province;
import com.v1ntage.marketplace.province.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(path = "api/v1/comments")
public class CommentController {
    @Autowired
    CommentService commentService;

    @GetMapping
    public List<Comment> getComments(){
        return commentService.getAll();
    }

    @GetMapping("/{commentId}")
    public Optional<Comment> getComment(@PathVariable("commentId") UUID id){
        return commentService.get(id);
    }

    @PostMapping
    public ResponseEntity<Comment> createComment(@RequestBody Comment comment) {
        try {
            commentService.saveOrUpdate(comment);
            return new ResponseEntity<>(comment, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
