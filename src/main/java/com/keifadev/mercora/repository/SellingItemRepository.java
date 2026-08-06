package com.keifadev.mercora.repository;

import com.keifadev.mercora.model.SellingItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SellingItemRepository extends JpaRepository<SellingItem, Long> {
    List<SellingItem> findBySellingId(UUID sellingId);

    Page<SellingItem> findByProductId(Long productId, Pageable pageable);
}
