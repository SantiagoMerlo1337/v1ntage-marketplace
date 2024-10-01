package com.v1ntage.marketplace.users;
import com.v1ntage.marketplace.city.City;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(length = 48, nullable = false)
    private String username;

    @Column(name = "email_address", unique = true, length = 64, nullable = false)
    private String emailAddress;

    @Column(name = "created_at", updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "phone_number")
    private Long phoneNumber;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

//    role

}
