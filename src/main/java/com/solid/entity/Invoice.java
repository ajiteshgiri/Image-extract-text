package com.solid.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="Invoice")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double amt;
}
