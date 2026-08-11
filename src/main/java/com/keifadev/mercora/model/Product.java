package com.keifadev.mercora.model;

import com.keifadev.mercora.enums.Category;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String sku;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(nullable = false, name = "selling_price", precision = 12, scale = 2)
    private BigDecimal sellingPrice;

    @Column(nullable = false, name = "minimum_stock")
    private Integer minimumStock;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Batch> batches;
}