package com.vehicletelematics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicletelematics.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);
	
	public User findById(long id);
	
	public boolean existsByEmail(String email);
	
	public User findByEmailAndPassword(String email, String password);

}
