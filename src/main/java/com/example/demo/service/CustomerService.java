package com.example.demo.service;

import com.example.demo.model.Concert;
import com.example.demo.model.Customer;
import com.example.demo.model.Ticket;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.repositories.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerService {

    CustomerRepository cr;

    public CustomerService(CustomerRepository customerRepository) {
        this.cr = customerRepository;
    }

    public Customer addParticipant(Concert concert) {
        Random r = new Random();
        int low = 1;
        int high = 1000;
        int serialNumber = r.nextInt(high-low) + low;

        Customer customer = new Customer(serialNumber, concert);

        return cr.save(customer);
    }

}
