package com.cg.bi.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "hbl_bi_Address_2")
public class Address {
	@Id
	@Column
	private int id;
	@Column
	private String street;
	@Column
	private String city;
	@Column
	private String country;
	@OneToOne
	@JoinColumn
	private Student student;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int id, String street, String city, String country) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", country=" + country + ", student="
				+ student + "]";
	}
	
	
	
}
