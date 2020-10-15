package com.example.demo.controller;

import com.example.demo.dto.ConcertDTO;
import com.example.demo.model.Concert;
import com.example.demo.service.ConcertService;
import com.example.demo.service.CustomerService;
import com.example.demo.service.TicketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ConcertController {

    private ConcertService concertService;
    private CustomerService customerService;
    private TicketService ticketService;

    public ConcertController(ConcertService concertService, CustomerService customerService, TicketService ticketService) {
        this.concertService = concertService;
        this.customerService = customerService;
        this.ticketService = ticketService;
    }

    @GetMapping("/")
    String index() {
        return "index";
    }

    @GetMapping("/create")
    String createBookingSite() {
        return "booking";
    }

    @PostMapping("/create")
    String createBooking(@RequestBody ConcertDTO concertDTO) {
        concertService.createBooking(concertDTO);
        return "index";
    }

    @PostMapping("/addParticipant/{id}")
    String addParticipant(HttpServletRequest request) {
        String url = request.getRequestURI();
        int id = Integer.parseInt(url.substring(url.lastIndexOf('/') + 1));
        Concert concert = concertService.findById(id);
        customerService.addParticipant(concert);
        return "index";
    }

    @GetMapping("/getBookings")
    ResponseEntity<List<Concert>> getAllBookings() {
        List<Concert> tmp = concertService.findAllBookings();
        return new ResponseEntity<>(tmp, HttpStatus.OK);
    }

}
