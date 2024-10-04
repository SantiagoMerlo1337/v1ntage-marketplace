package com.v1ntage.marketplace.comment;

import com.v1ntage.marketplace.province.Province;
import com.v1ntage.marketplace.province.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;

    public List<Comment> getAll(){
        return commentRepository.findAll();
    }

    public Optional<Comment> get(UUID id){
        return commentRepository.findById(id);
    }

    public void saveOrUpdate(Comment comment){
        commentRepository.save(comment);
    }

    public void delete(UUID id){
        commentRepository.deleteById(id);
    }
}
