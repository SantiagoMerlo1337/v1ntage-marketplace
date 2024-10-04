package com.v1ntage.marketplace.comment;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.v1ntage.marketplace.articles.Article;
import com.v1ntage.marketplace.province.Province;
import com.v1ntage.marketplace.users.User;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length = 64, nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "article_id", nullable = false)
    private Article article;
}
