package com.greatlearning.springboot.service;

import org.springframework.data.repository.CrudRepository;

import com.greatlearning.springboot.entity.Tickets;


public interface TicketsRepository extends CrudRepository<Tickets, String> {


	
}
