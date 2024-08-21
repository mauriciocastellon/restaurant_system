package com.example.restaurant_system.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Customer {
    private Long id;
    private String name;
    private String email;
    private String phone;
}
