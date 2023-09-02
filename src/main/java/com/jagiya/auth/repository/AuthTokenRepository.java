package com.jagiya.auth.repository;

import com.jagiya.auth.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthTokenRepository extends JpaRepository<Token, Long> {
    Optional<Token> findByUsersTbUsersId(Long userId);
}
