package com.greatlearning.springboot.DAO;

import java.util.List;

import com.greatlearning.springboot.entity.Tickets;


public interface TicketsDAO {
	public List<Tickets> findAll();
	public Tickets findById(int theId);
	 public void save (Tickets tickets);
	  public void deleteById(int theId);
	
	
}