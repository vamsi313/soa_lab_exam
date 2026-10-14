package com.klu.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.klu.springmvc.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    boolean existsByEmailOrUserName(String email, String userName);

    boolean existsByEmail(String email);

    boolean existsByUserName(String userName);
}
