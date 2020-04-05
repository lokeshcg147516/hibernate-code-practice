package com.cg.uni.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@Column
	private int studentId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String Section;
	@OneToOne
	@JoinColumn(name = "HOME_ADDRESS_ID")
	private Address address;

	@ManyToOne(optional = false)
	@JoinColumn(name = "UNIVERSITY_ID")
	private University university;

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
		return Section;
	}

	public void setSection(String section) {
		Section = section;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student(int studentId, String firstName, String lastName, String section, Address address) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		Section = section;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", Section="
				+ Section + ", address=" + address + "]";
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

}
