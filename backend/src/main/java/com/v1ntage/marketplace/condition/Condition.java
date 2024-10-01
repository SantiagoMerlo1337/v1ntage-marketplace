package com.v1ntage.marketplace.condition;

import com.v1ntage.marketplace.articles.Article;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "`condition`") // Palabra reservada, por eso hay que escaparla de la consulta
public class Condition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 32)
    private String description;

    @OneToMany(mappedBy = "condition", cascade = CascadeType.ALL)
    private List<Article> articles;

}
