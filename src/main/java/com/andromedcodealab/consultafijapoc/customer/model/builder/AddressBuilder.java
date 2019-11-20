package com.andromedcodealab.consultafijapoc.customer.model.builder;

import com.andromedcodealab.consultafijapoc.customer.model.Address;

public class AddressBuilder {

    private Address address;

    public AddressBuilder() {
        this.address = new Address();
    }

    public Address build() {
        return address;
    }

    public AddressBuilder withCity(String city) {
        address.setCity(city);
        return this;
    }

    public AddressBuilder withStreet(String street) {
        address.setStreet(street);
        return this;
    }

    public AddressBuilder withNumber(Integer number) {
        address.setNumber(number);
        return this;
    }
}
