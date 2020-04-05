package com.cg.bi.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class HeadOfDept {
	@Id
	private int leturer_id;
	@Column
	private String name;
	@Column
	private int exp;
	@OneToOne(mappedBy = "headOfDept", cascade = CascadeType.ALL)
	private Subject subject;

	public int getLeturer_id() {
		return leturer_id;
	}

	public void setLeturer_id(int leturer_id) {
		this.leturer_id = leturer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public HeadOfDept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HeadOfDept(int leturer_id, String name, int exp, Subject subject) {
		super();
		this.leturer_id = leturer_id;
		this.name = name;
		this.exp = exp;
		this.subject = subject;
	}

}
