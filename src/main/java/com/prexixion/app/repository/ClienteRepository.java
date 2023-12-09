package com.prexixion.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prexixion.app.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String>{
    // Puedes agregar consultas personalizadas si es necesario
}
