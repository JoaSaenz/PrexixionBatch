/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joa.spring.batch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Joaquín
 */
@Entity
@Table(name = "CUSTOMER_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    
    @Id
    @Column(name = "CUSTOMER_ID")
    private int id;
    
    @Column(name = "FIRST_NAME")
    private String firstName;
    
    @Column(name = "LAST_NAME")
    private String lastName;
    
    @Column(name = "EMAIL")
    private String email;
    
    @Column(name = "GENDER")
    private String gender;
    
    @Column(name = "CONTACT")
    private String contactNo;
    
    @Column(name = "COUNTRY")
    private String country;
    
    @Column(name = "DOB")
    private String dob;
    
    
    
    
}
