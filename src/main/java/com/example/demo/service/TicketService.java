package com.example.demo.service;

import com.example.demo.model.Ticket;
import com.example.demo.repositories.TicketRepository;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket findById(int id) {
        return ticketRepository.findById(id);
    }


}
