package com.prexixion.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    
    @Id
    @Column(name = "ruc")
    private String ruc;

    @Column(name = "y")
    private String y;

    @Column(name = "razonSocial")
    private String razonSocial;

    @Column(name = "nombreCorto")
    private String nombreCorto;
    
    //TIPO CONTRIBUYENTE: 
    //1) Persona Jur[idica 
    //2) Persona Natural
    @Column(name = "idContribuyente")
    private int idContribuyente; 
}
