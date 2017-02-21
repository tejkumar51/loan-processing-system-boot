package com.osi.loan.repository.jpa;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import com.osi.loan.domain.User;

public interface UserRepository extends JpaRepository<User, String> {

	@Query("SELECT u.userName FROM User u")
	public List<String> getAllUserNames(Pageable pageable);

	@Query("SELECT u.userName FROM User u")
	public List<String> getAllUserNames(Sort sort);

	// @Query("SELECT * from User") - Not needed as spring JPA generates the select query by pre-defined keywords - findBy<domain class property name> 
	public User findByUserName(String userName);

	@Procedure(procedureName = "update_username_bypk")
	public void updateUserNameById(Integer userId, String userName);

}
