package com.simtlix.consultafijapoc.customer.model.builder;

import com.simtlix.consultafijapoc.customer.model.Customer;

public class CustomerBuilder {

    private Customer customer;

    public CustomerBuilder() {
        this.customer = new Customer();
    }

    public Customer build() {
        return customer;
    }

    public CustomerBuilder withNombre(String nombre) {
        customer.setNombre(nombre);
        return this;
    }

    public CustomerBuilder withApellido(String apellido) {
        customer.setApellido(apellido);
        return this;
    }

    public CustomerBuilder withDni(Integer dni) {
        customer.setDni(dni);
        return this;
    }
}
