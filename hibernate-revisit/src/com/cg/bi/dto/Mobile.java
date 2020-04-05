package com.cg.bi.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Mobile {
	@Id
	@Column
	private int id;
	@Column
	private String imei;
	@Column
	private long mobileNum;
	@ManyToOne
	@JoinColumn
	private Person person;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public long getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(int id, String imei, long mobileNum) {
		super();
		this.id = id;
		this.imei = imei;
		this.mobileNum = mobileNum;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", imei=" + imei + ", mobileNum=" + mobileNum + ", person=" + person + "]";
	}

}
