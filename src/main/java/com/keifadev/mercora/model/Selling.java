package com.keifadev.mercora.model;

import com.keifadev.mercora.enums.Payment;
import com.keifadev.mercora.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "selling")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Selling {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "selling", cascade = CascadeType.ALL)
    private List<SellingItem> items;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Payment payment;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;
}
