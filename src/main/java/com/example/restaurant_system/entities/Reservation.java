package com.example.restaurant_system.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class Reservation {
    private Long id;
    private LocalDateTime dateTime;
    private Customer customer;
    private int numberOfPeople;
}
