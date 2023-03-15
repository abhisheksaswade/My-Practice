package com.app.pojos;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Advertisement extends BaseEntity{

//data members
	@Column(length=20)
	private String product;
	
	@Column(length=20)
	private String brand;
	
	private LocalDate dateOfTelecast;
	
	@Column(length=20)
	private String status;

	
//constructors	
	public Advertisement() {
		super();
	}

	public Advertisement(String product, String brand, LocalDate dateOfTelecast, String status) {
		super();
		this.product = product;
		this.brand = brand;
		this.dateOfTelecast = dateOfTelecast;
		this.status = status;
	}


//ToString
	@Override
	public String toString() {
		return "Advertisement [product=" + product + ", brand=" + brand + ", dateOfTelecast=" + dateOfTelecast
				+ ", status=" + status + "]";
	}
	

//Getters & Setters
	
	public String getProduct() {
		return product;
	}





	public void setProduct(String product) {
		this.product = product;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getDateOfTelecast() {
		return dateOfTelecast;
	}

	public void setDateOfTelecast(LocalDate dateOfTelecast) {
		this.dateOfTelecast = dateOfTelecast;
	}
	
	
	

	
}
