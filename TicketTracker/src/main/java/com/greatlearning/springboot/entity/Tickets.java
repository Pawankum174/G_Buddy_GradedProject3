package com.greatlearning.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="booking")
public class Tickets {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private String id;
	
	@Column(name="ticketTitle", nullable = false)
	private String ticketTitle;
	
	@Column(name="ticketShortDescription")
	private String ticketShortDescription;
	
	@Column(name="ticketCreatedOn")
	private String ticketCreatedOn;
	
	public Tickets (String tTitle, String tShortDes, String tCreated) {
		this.ticketTitle =tTitle;
		this.ticketShortDescription =tShortDes;
		this.ticketCreatedOn =tCreated;
		
		}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTicketTitle() {
		return ticketTitle;
	}

	public void setTicketTitle(String ticketTitle) {
		this.ticketTitle = ticketTitle;
	}

	public String getTicketShortDescription() {
		return ticketShortDescription;
	}

	public void setTicketShortDescription(String ticketShortDescription) {
		this.ticketShortDescription = ticketShortDescription;
	}

	public String getTicketCreatedOn() {
		return ticketCreatedOn;
	}

	public void setTicketCreatedOn(String ticketCreatedOn) {
		this.ticketCreatedOn = ticketCreatedOn;
	}
	
	}
	

	