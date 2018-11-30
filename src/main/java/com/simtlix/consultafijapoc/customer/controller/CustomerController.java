package com.simtlix.consultafijapoc.customer.controller;

import com.simtlix.consultafijapoc.customer.model.Customer;
import com.simtlix.consultafijapoc.customer.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/api/customer")
@Secured("ROLE_USER")
public class CustomerController {
    private Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerService customerService;

    @GetMapping(path = "/greeting", produces = "application/json")
    public Map getGreeting() {
        logger.info("Method 'getGreting()' was called");
        return Collections.singletonMap("greeting", "Hola desde el Customer webservice");
    }

    @GetMapping(path = "/list", produces = "application/json")
    public Iterable<Customer> getAllCustomers(){
        logger.info("Method 'getAllCustomers()' was called");
        return customerService.getAllCustomers();
    }

    @GetMapping(path = "/{dni}")
    public Customer getCustomerByDni(@PathVariable("dni") String dni) {
        logger.info("Method 'getCustomerByDni' was called for DNI: " + dni);
        return customerService.findCustomerByDni(Integer.valueOf(dni));
    }
}
