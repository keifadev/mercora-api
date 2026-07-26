package com.keifadev.mercora.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "batch")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Batch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, name = "unique_code")
    private String uniqueCode;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false, name = "expiration_date")
    private LocalDate expirationDate;

    @Column(nullable = false, name = "entry_date")
    private LocalDate entryDate;

    @Column(nullable = false, name = "cost_price", precision = 12, scale = 2)
    private BigDecimal costPrice;
}
