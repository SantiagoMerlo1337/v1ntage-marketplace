package com.v1ntage.marketplace.articles;

import com.v1ntage.marketplace.articles.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(path = "api/v1/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping
    public List<Article> getArticles(){
        return articleService.getAll();
    }

    @GetMapping("/{articleId}")
    public Optional<Article> getArticle(@PathVariable("articleId") UUID articleId){
        return articleService.get(articleId);
    }

}
