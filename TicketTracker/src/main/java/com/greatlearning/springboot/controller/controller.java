package com.greatlearning.springboot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.greatlearning.springboot.entity.Tickets;
import com.greatlearning.springboot.service.TicketsService;

@RestController
public class controller {

    

    @Autowired
    private TicketsService ticketsService;

 
    @GetMapping("/tickets")
    public java.util.List<Tickets> getAllTickets() {

        return ticketsService.getAllTickets();

    }

    
    @GetMapping("/tickets/{id}")
    public Optional<Tickets> getTickets(@PathVariable String id) {

        return ticketsService.getTickets(id);
    }

   
    
    @DeleteMapping("/tickets/{id}")
    public void deleteTickets(@PathVariable String id) {
        ticketsService.deleteTickets(id);
    }



    @PutMapping("/tickets/{id}")
    public void updateTickets(@RequestBody Tickets updated, @PathVariable String id) {
        ticketsService.updateTickets(updated,id);
    }





}