package com.cognizant.irctc.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.irctc.bindings.PassengerInfo;
import com.cognizant.irctc.bindings.TicketInfo;

@RestController
public class TrainTicketBookingController {
 @PostMapping(value = "/bookticket",
		      consumes = {"application/xml","application/json"},
		      produces = {"application/xml","application/json"}
		     ) 
 public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo passenger){
	 //logic to generate journey ticket
	 TicketInfo ticket = new TicketInfo();
	 ticket.setPnr("XZGATW");
	 ticket.setName(passenger.getName());
	 ticket.setFromStation(passenger.getFromStation());
	 ticket.setToStation(passenger.getToStation());
	 ticket.setDateOfJourney(passenger.getDateOfJourney());
	 ticket.setDateOfBooking(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
	 ticket.setTrainNo(passenger.getTrainNo());
	 ticket.setTicketStatus("Confirmed");
	 ticket.setTicketPrice(895.75f);
	 
	 
	 ResponseEntity<TicketInfo> ticketEntity = new ResponseEntity<>(ticket, HttpStatus.CREATED);
	 return ticketEntity;
 }
 
 @GetMapping(value = "status/{pnr}",
		 	 produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
		 	)
 public ResponseEntity<String> checkStatus(@PathVariable String pnr){
	 //get the ticket info based on PNT from DB
	 //produces attribute is not mandatory in this scenario
	 ResponseEntity<String> ticketStatus = new ResponseEntity<>("Ticket with PNR: "+pnr+" is CONFIRMED", HttpStatus.CREATED);
	 return ticketStatus;	 
 }
}
