package com.jagiya.auth.repository;

import com.jagiya.main.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthUsersRepository extends JpaRepository<Users, Long> {
    Optional<Users> findBySnsTypeAndEmail(Integer SnsType, String email);
}
