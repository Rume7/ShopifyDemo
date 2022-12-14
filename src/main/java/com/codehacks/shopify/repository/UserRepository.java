package com.codehacks.shopify.repository;

import com.codehacks.shopify.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: Rhume Disi
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
