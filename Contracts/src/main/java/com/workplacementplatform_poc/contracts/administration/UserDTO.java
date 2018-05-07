package com.workplacementplatform_poc.contracts.administration;

public class UserDTO{
	private String givenName;
	private String surname;
	private String userRole;
	
	public UserDTO(String aGivenName, String aSurname, String aUserRole) {
		givenName = aGivenName;
		surname = aSurname;
		userRole = aUserRole;
	}
	
	public UserDTO() {}
	
	public String getGivenName() {
		return givenName;
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
}