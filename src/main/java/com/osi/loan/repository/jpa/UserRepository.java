package com.osi.loan.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.osi.loan.domain.User;

public interface UserRepository extends JpaRepository<User, String> {

}
