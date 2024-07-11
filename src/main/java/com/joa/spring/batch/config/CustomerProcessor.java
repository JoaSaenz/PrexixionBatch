
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joa.spring.batch.config;

import com.joa.spring.batch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

/**
 *
 * @author Joaquín
 */
public class CustomerProcessor implements ItemProcessor<Customer, Customer>{

    @Override
    public Customer process(Customer customer) throws Exception {
//        if(customer.getCountry().equals("United States")){
            return customer;
//        } else {
//            return null;
//        }
    }
    
    
    
}
