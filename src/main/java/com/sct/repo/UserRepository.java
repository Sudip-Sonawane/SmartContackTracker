package com.sct.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sct.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
