package com.UseCase1.assignment_aditya.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "product")
    private String productName;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    public ProductEntity(String productName, String description, double price) {
        this.productName = productName;
        this.description = description;
        this.price = price;
    }
}
