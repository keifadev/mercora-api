package com.keifadev.mercora.repository;

import com.keifadev.mercora.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {
    Optional<Client> findByName(String name);

    Optional<Client> findByPhone(String phone);
}
