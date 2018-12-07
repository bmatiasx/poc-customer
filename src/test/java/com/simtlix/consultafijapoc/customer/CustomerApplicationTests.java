package com.simtlix.consultafijapoc.customer;

import com.simtlix.consultafijapoc.customer.controller.CustomerController;
import com.simtlix.consultafijapoc.customer.model.Customer;
import com.simtlix.consultafijapoc.customer.model.builder.CustomerBuilder;
import com.simtlix.consultafijapoc.customer.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest(CustomerController.class)
public class CustomerApplicationTests {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CustomerService service;

    @Autowired
    WebApplicationContext context;

	@Test
	public void whenGetAllCustomers_thenReturnJsonArray() throws Exception{

        CustomerBuilder builder = new CustomerBuilder();
        builder.withDni(30000000).withNombre("diego").withApellido("maradona");
        Customer diego = builder.build();

        CustomerBuilder builder1 = new CustomerBuilder();
        builder1.withDni(30000000).withNombre("john").withApellido("carmac");
        Customer john = builder1.build();

        List<Customer> allCustomers = Arrays.asList(diego, john);

        given(service.getAllCustomers()).willReturn(allCustomers);

        mvc.perform(get("/customer/api/list")
                .contentType(MediaType.APPLICATION_JSON));
	}

}
