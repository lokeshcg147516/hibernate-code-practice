package com.cg.uni.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class University {

	@Id
	@Column(name = "UNIVERSITY_ID")
	private long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "COUNTRY")
	private String country;

	public University() {

	}

	public University(long id,String name, String country) {
		this.id=id;
		this.name = name;
		this.country = country;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", country=" + country + "]";
	}
}
