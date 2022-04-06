package org.trb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.trb.model.User;

@Repository
public interface UserRepository extends JpaRepository < User, Long > {
    User findByEmail(String email);
}