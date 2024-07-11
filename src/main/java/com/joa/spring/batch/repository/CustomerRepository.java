/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.joa.spring.batch.repository;

import com.joa.spring.batch.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Joaquín
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    
}
