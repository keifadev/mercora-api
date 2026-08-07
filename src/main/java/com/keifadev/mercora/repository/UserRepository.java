package com.keifadev.mercora.repository;

import com.keifadev.mercora.enums.Role;
import com.keifadev.mercora.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByName(String name);

    Optional<User> findByEmail(String email);

    Optional<User> findByRole(Role role);
}
