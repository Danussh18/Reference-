package com.cognizant.irctc.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class TicketInfo {
	private String pnr;
	private String name;
	private String fromStation;
	private String toStation;
	private String dateOfJourney;
	private String dateOfBooking;
	private Integer trainNo;
	private Float ticketPrice;
	private String ticketStatus;
}
