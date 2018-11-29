package com.simtlix.consultafijapoc.customer.controller;

import com.simtlix.consultafijapoc.customer.model.Customer;
import com.simtlix.consultafijapoc.customer.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    private Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerService customerService;

    @GetMapping(path = "/greeting", produces = "application/json")
    @Secured("ROLE_USER")
    public Map getGreeting() {
        logger.info("Method 'getGreting()' was called");
        return Collections.singletonMap("greeting", "Hola desde el Customer webservice");
    }

    @GetMapping(path = "/list", produces = "application/json")
    @Secured("ROLE_USER")
    public List<Customer> getAllCustomers() throws SQLException {
        logger.info("Method 'getAllCustomers()' was called");
        return customerService.getAllCustomers();
    }
}
