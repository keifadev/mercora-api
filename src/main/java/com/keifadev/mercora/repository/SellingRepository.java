package com.keifadev.mercora.repository;

import com.keifadev.mercora.enums.Payment;
import com.keifadev.mercora.enums.Status;
import com.keifadev.mercora.model.Selling;
import com.keifadev.mercora.model.SellingItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

public interface SellingRepository extends JpaRepository<Selling, UUID> {
    Optional<Selling> findByDate(LocalDate date);

    Optional<Selling> findByClientId(UUID clientId);

    Page<Selling> findByItems_ProductId(Long productId, Pageable pageable);

    Optional<Selling> findByPayment(Payment payment);

    Optional<Selling> findByStatus(Status status);
}
