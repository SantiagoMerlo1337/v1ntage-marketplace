package com.v1ntage.marketplace.sub_category;

import com.v1ntage.marketplace.articles.Article;
import com.v1ntage.marketplace.category.Category;
import com.v1ntage.marketplace.city.City;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 84, nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @OneToMany(mappedBy = "subcategory", cascade = CascadeType.ALL)
    private List<Article> articles;
}
