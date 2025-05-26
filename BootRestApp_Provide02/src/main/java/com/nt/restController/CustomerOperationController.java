package com.nt.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerOperationController {

    @GetMapping("/report")
    public ResponseEntity<Customer> showCustomer() {
        Customer cust = new Customer(101, "Raja", "Hyd");
        return new ResponseEntity<>(cust, HttpStatus.OK);
    }
}
