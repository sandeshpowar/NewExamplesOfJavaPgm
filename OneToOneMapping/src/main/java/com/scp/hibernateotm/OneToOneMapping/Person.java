package com.scp.hibernateotm.OneToOneMapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity

public class Person {
	private int personID;
	private String personName;
	private PersonDetails pDetails;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="pDetails_FK")
	public PersonDetails getpDetails() {
		return pDetails;
	}

	public void setpDetails(PersonDetails pDetails) {
		this.pDetails = pDetails;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int personID, String personName) {
		super();
		this.personID = personID;
		this.personName = personName;
	}
	@Id
	@GeneratedValue

	public int getPersonID() {
		return personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	

}
