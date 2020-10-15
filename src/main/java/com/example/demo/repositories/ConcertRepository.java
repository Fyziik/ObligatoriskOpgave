package com.example.demo.repositories;

import com.example.demo.model.Concert;
import com.example.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ConcertRepository extends JpaRepository<Concert, Integer> {

    Concert findById(int id);
}
