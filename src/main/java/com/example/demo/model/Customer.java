package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Concert concert;

    @ManyToMany (mappedBy = "customers")
    private Set<Ticket> ticket;

    private int serialNumber;

    public Customer(int serialNumber, Concert concertId, Ticket ticket) {
        this.serialNumber = serialNumber;
        this.concert = concertId;
        this.ticket.add(ticket);
    }

    public Customer(int serialNumber, Concert concertId) {
        this.serialNumber = serialNumber;
        this.concert = concertId;
    }

    public Customer() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Set<Ticket> getTicket() {
        return ticket;
    }

    public void setTicket(Set<Ticket> ticket) {
        this.ticket = ticket;
    }

    public void setConcert(Concert concert) {
        this.concert = concert;
    }

    public void addTicket(Ticket ticket) {
        this.ticket.add(ticket);
    }


}
