package com.andromedcodealab.consultafijapoc.customer.model.builder;

import com.andromedcodealab.consultafijapoc.customer.model.Customer;

public class CustomerBuilder {

    private Customer customer;

    public CustomerBuilder() {
        this.customer = new Customer();
    }

    public Customer build() {
        return customer;
    }

    public CustomerBuilder withNombre(String nombre) {
        customer.setName(nombre);
        return this;
    }

    public CustomerBuilder withApellido(String apellido) {
        customer.setSurname(apellido);
        return this;
    }

    public CustomerBuilder withDni(Integer dni) {
        customer.setDni(dni);
        return this;
    }
}
