package com.simtlix.consultafijapoc.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "S_CLIENT_ACCOUNTS", schema = "EBILL")
public class Customer {

    @Id
    @Column(name = "CLT_IDENTIFICATION_NUMBER")
    private Integer dni;

    @Column(name = "CLT_ID")
    private Integer id;

    @Column(name = "CLT_NAME")
    private String nombre;

    @Column(name = "CLT_SURNAME")
    private String apellido;

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
