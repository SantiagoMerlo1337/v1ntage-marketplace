package com.v1ntage.marketplace.articles;

import com.v1ntage.marketplace.category.Category;
import com.v1ntage.marketplace.users.User;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "created_at", updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(name = "`condition`", nullable = false)
    private Condition condition;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category subCategory;

}
