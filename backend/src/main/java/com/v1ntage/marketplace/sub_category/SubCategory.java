package com.v1ntage.marketplace.sub_category;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.v1ntage.marketplace.articles.Article;
import com.v1ntage.marketplace.category.Category;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 84, nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @OneToMany(mappedBy = "subCategory", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Article> articles;
}
