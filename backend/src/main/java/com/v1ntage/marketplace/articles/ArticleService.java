package com.v1ntage.marketplace.articles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ArticleService {
    @Autowired
    ArticleRepository articleRepository;

    public List<Article> getAll(){
        return articleRepository.findAll();
    }

    public Optional<Article> get(UUID id){
        return articleRepository.findById(id);
    }

    public void saveOrUpdate(Article article){
        articleRepository.save(article);
    }

    public void delete(UUID id){
        articleRepository.deleteById(id);
    }


}
