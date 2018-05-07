package com.workplacementplatform.services;

public class AuthenticationService {
	public AuthenticationService() {}
	public boolean AuthenticateUser(String username, String password) {
		return(username.equals("michael") && password.equals("password"));
	}
}