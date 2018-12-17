package com.simtlix.consultafijapoc.customer.model;

import com.simtlix.consultafijapoc.customer.model.builder.AddressBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AccountTest {

    private Account account;

    @Before
    public void setup() {
        account = new Account();
    }

    @Test
    public void accountIdTest() {
        account.setAccountId(1L);
        assertThat(account.getAccountId(), is(1L));
    }

    @Test
    public void clientIdTest() {
        account.setClientId(1);
        assertThat(account.getClientId(), is(1));
    }

    @Test
    public void addressesTest() {
        AddressBuilder addressBuilder = new AddressBuilder();
        addressBuilder.withCity("Springfield").withStreet("Evergreen").withNumber(123);
        Address address1 = addressBuilder.build();

        addressBuilder.withCity("Córdoba").withStreet("Colón").withNumber(1200);
        Address address2 = addressBuilder.build();

        List<Address> addressesList = new ArrayList<>(Arrays.asList(
                address1,
                address2
        ));

        account.setAddresses(addressesList);
        assertThat(account.getAddresses().size(), is(2));
    }

}
