package com.workplacementplatform_poc.contracts.administration;

import java.util.List;

public class GetUsersListResponse {
	private List<UserDTO> UserList;

	public GetUsersListResponse() {}
	
	public GetUsersListResponse(List<UserDTO> aUserList) {
		UserList = aUserList;
	}
	
	public List<UserDTO> getUserList() {
		return UserList;
	}

	public void setUserList(List<UserDTO> userList) {
		UserList = userList;
	}
}
