package com.cg.uni.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Address {
	@Id
	@Column
	private int addressId;
	@Column
	private String street;
	@Column
	private String city;
	@Column
	private String country;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address(int addressId, String street, String city, String country) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", country=" + country
				+ "]";
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

}
