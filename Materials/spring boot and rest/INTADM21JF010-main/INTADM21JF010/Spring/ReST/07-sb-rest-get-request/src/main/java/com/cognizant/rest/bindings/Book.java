package com.cognizant.rest.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
 @JsonProperty("bid")
 @XmlElement(name = "bookid")
 private Long bookId;
 
 @JsonProperty("bname")
 private String bookName;
 
 @JsonProperty("bprice")
 private Float bookPrice; 
}
