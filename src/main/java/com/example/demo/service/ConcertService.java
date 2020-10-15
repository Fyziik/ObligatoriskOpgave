package com.example.demo.service;

import com.example.demo.dto.ConcertDTO;
import com.example.demo.model.Concert;
import com.example.demo.repositories.ConcertRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConcertService {

    ConcertRepository cr;

    public ConcertService(ConcertRepository concertRepository) {
        this.cr = concertRepository;
    }

    public List<Concert> findAllBookings() {
        return cr.findAll();
    }

    public Concert createBooking(ConcertDTO concertDTO) {
        Concert concert = new Concert();
        concert.setName(concertDTO.getName());
        return cr.save(concert);
    }

    public Concert findById(int id) {
        return cr.findById(id);
    }

}
