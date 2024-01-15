package com.greatlearning.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.springboot.entity.Tickets;

@Service
public class TicketsService {

    

    @Autowired
    TicketsRepository ticketsRepository;

    public List<Tickets> getAllTickets() {

        ArrayList<Tickets> allTickets = new ArrayList<>();
        ticketsRepository.findAll();

        return allTickets;
    }

    public Optional<Tickets> getTickets(String id) {

        return ticketsRepository.findById(id);


    }

   
    public void deleteTickets(String id) {

        ticketsRepository.deleteById(id);

    }

    public void updateTickets(Tickets updated, String id) {



          ticketsRepository.save(updated);


    }

	
}