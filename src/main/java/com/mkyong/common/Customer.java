package com.mkyong.common;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class Customer {

//	@Autowired(required=false)
    @Autowired
	private Set<Person> persons;
	private int type;
	private String action;

	public Set<Person> getPersons() {
		return persons;
	}

	public void setPerson(Set<Person> persons) {
		this.persons = persons;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "Customer [persons=" + persons + ", type=" + type + ", action=" + action + "]";
	}

}