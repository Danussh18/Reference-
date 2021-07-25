package com.cognizant.rest.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class Customer {
 private Integer customerId;
 private String customerName;
 private String customerEmail; 
}
