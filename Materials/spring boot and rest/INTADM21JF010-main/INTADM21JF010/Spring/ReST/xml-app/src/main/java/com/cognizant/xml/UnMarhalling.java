package com.cognizant.xml;

import java.io.File;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.cognizant.xml.bindings.Customer;

public class UnMarhalling {

	public static void main(String[] args) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
		Unmarshaller unMarshallObj =  jaxbContext.createUnmarshaller();
		
		File xmlFile = new File("target/customer.xml");
		Customer customer = (Customer)unMarshallObj.unmarshal(xmlFile);
		System.out.println(customer.getCustomerId()+ " | "+customer.getCustomerName()+" | "+customer.getCustomerEmail());
		
		String xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n"
				+ "<customer>\r\n"
				+ "    <cid>101234</cid>\r\n"
				+ "    <name>Praveen Kumar</name>\r\n"
				+ "    <email>praveen@gmail.com</email>\r\n"
				+ "</customer>";
		
		StringReader xmlSource = new StringReader(xmlData);
		customer = (Customer)unMarshallObj.unmarshal(xmlSource);
		System.out.println(customer.getCustomerId()+ " | "+customer.getCustomerName()+" | "+customer.getCustomerEmail());
	}

}
