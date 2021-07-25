package com.cognizant.irctc.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class PassengerInfo {
	private String name;
	private String fromStation;
	private String toStation;	
	private String dateOfJourney;
	private Integer trainNo;
}
