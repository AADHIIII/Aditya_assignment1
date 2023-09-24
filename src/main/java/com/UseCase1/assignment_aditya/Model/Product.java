package com.UseCase1.assignment_aditya.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private long id;
    private String productName;
    private String description;
    private double price;
}

