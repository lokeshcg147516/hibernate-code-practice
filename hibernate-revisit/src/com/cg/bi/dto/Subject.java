package com.cg.bi.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
public class Subject {

	@Id
	@Column
	private int subId;
	@Column
	private String subName;
	@Column
	private String subCategory;
	@OneToOne
	@JoinColumn
	private HeadOfDept headOfDept;
	public int getSubId() {
		return subId;
	}	
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public HeadOfDept getHeadOfDept() {
		return headOfDept;
	}
	public void setHeadOfDept(HeadOfDept headOfDept) {
		this.headOfDept = headOfDept;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(int subId, String subName, String subCategory, HeadOfDept headOfDept) {
		super();
		this.subId = subId;
		this.subName = subName;
		this.subCategory = subCategory;
		this.headOfDept = headOfDept;
	}
	
	
}
