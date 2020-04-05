package com.cg.bi.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hbl_bi_student_2")
public class Student {
	@Id
	@Column
	private int id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String section;
	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student(int id, String firstName, String lastName, String section) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.section = section;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", section=" + section
				+ ", address=" + address + "]";
	}

}
