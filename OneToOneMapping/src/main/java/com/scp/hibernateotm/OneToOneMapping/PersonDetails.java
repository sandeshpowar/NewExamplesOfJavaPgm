package com.scp.hibernateotm.OneToOneMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PersonDetails {
	private int personDetailId;
	private String zipCode;
	private String job;
	private int income;
	
	public PersonDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonDetails(int personDetailId, String zipCode, String job, int income) {
		super();
		this.personDetailId = personDetailId;
		this.zipCode = zipCode;
		this.job = job;
		this.income = income;
	}
    @Id
    @GeneratedValue
    @Column(name="detailed_PK")
	public int getPersonDetailId() {
		return personDetailId;
	}

	public void setPersonDetailId(int personDetailId) {
		this.personDetailId = personDetailId;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = (int) income;
	}
	
	

}
