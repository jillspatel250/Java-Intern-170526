package com.example.jpa.entity;

import com.example.jpa.enums.EmployeeType;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "employees")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false, length = 100)
    private String name;

    private double salary;

    @Enumerated(EnumType.STRING)
    private EmployeeType type;

    @Temporal(TemporalType.DATE)
    private Date joinDate;

    @Lob
    private String bio;

    @Transient
    private int tempCalculation;
}
