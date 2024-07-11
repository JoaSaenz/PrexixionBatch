/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joa.spring.batch.config;

import com.joa.spring.batch.entity.Customer;
import com.joa.spring.batch.repository.CustomerRepository;
import java.util.List;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Joaquín
 */
@Component
public class CustomerWriter implements ItemWriter<Customer> {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void write(List<? extends Customer> list) throws Exception {
        System.out.println("Thread Name: "+Thread.currentThread().getName());
        customerRepository.saveAll(list);
    }

}
