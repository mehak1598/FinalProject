package com.aciworldwide.BEC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aciworldwide.BEC.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
