package com.v1ntage.marketplace.city;

import com.v1ntage.marketplace.province.Province;
import com.v1ntage.marketplace.users.User;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 64)
    private String description;

    @ManyToOne
    @JoinColumn(name = "province_id", nullable = false)
    private Province province;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private List<User> users;

}
