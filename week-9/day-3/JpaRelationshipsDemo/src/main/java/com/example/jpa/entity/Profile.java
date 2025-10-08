package com.example.jpa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bio;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
