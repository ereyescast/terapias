package com.nj.terapias.entity;

public class User {

	private String firstname;
	private String lastname;
	private String emailAddress;
	private String text;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public User(String firstname, String lastname, String emailAddress, String text) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailAddress = emailAddress;
		this.text = text;
	}

	public User() {
	}

}
