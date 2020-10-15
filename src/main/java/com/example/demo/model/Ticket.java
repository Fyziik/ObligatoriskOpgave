package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Ticket {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany
    private Set<Customer> customers;

    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




}
