package com.keifadev.mercora.repository;

import com.keifadev.mercora.model.Batch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BatchRepository extends JpaRepository<Batch, Long> {
    Optional<Batch> findByUniqueCode(String uniqueCode);

    Page<Batch> findByProductId(Long productId, Pageable pageable);
}
