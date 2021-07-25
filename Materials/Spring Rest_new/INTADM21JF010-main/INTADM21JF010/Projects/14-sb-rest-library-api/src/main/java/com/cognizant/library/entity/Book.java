package com.cognizant.library.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.cognizant.library.configs.validator.Author;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
	@Id
	@GeneratedValue
	private Long bookId;
	
	@NotEmpty(message = "Please provide the Book Title")
	private String bookTitle;
	
	@Author
	@NotEmpty(message = "Please provide the Book Author Name")
	private String bookAuthor;
	
	@NotNull(message = "Please provide Book Price")
	@DecimalMin("100.0")	
	private BigDecimal bookPrice;

	public Book(String bookTitle, String bookAuthor, BigDecimal bookPrice) {
		super();
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}
}
