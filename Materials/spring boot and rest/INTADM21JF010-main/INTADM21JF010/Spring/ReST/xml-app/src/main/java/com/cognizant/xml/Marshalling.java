package com.cognizant.xml;

import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.cognizant.xml.bindings.Customer;

public class Marshalling {

	public static void main(String[] args) throws JAXBException {
		//--- 1)create a Domain Model
		Customer customer = new Customer();
		customer.setCustomerId(101234L);
		customer.setCustomerName("Praveen Kumar");
		customer.setCustomerEmail("praveen@gmail.com");
		
		System.out.println(customer);
		
		//--- 2)marshalling (Java Domain Model Object -> XML Conversion)
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
		Marshaller xmlMarshaller = jaxbContext.createMarshaller();
		
		xmlMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		
		//---to get converted XML data as String
		StringWriter xmlWriter = new StringWriter();
		xmlMarshaller.marshal(customer, xmlWriter);
		String customerInXml = xmlWriter.toString();
		System.out.println(customerInXml);
		
		//--- to write the converted XML data to a file
		File xmlFile = new File("target/customer.xml");
		xmlMarshaller.marshal(customer, xmlFile);
		System.out.println("XML Marshalling completed...");
	}

}
