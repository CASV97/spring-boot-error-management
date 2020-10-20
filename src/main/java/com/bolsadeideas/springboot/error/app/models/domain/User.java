package com.bolsadeideas.springboot.error.app.models.domain;

/**
 * Ejemplo un poco mas completo, la idea es crear un lista de usuarios de
 * ejemplo y buiscar por el ID y si no lo encuentra, lanzar esta execcion
 */
public class User {
	private Integer id;
	private String firstName;
	private String lastName;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
