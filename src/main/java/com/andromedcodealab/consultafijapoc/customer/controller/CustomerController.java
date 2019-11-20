package com.andromedcodealab.consultafijapoc.customer.controller;

import com.andromedcodealab.consultafijapoc.customer.model.Customer;
import com.andromedcodealab.consultafijapoc.customer.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
@Secured("ROLE_USER")
public class CustomerController {

    private Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerService customerService;

    @GetMapping(path = "/{dni}")
    public Customer getCustomerByDni(@PathVariable(value = "dni", required = true) Integer dni) {
        logger.info("Method 'getCustomerByDni' was called for DNI: " + dni);
        return customerService.findCustomerByDni(dni);
    }
}
