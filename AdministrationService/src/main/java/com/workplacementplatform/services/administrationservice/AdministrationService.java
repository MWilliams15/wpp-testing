package com.workplacementplatform.services.administrationservice;

import java.util.ArrayList;
import java.util.List;

import com.workplacementplatform_poc.contracts.administration.*;



public class AdministrationService {
	public AdministrationService() {}
	public GetUsersListResponse GetUsersList() {
		GetUsersListResponse response = new GetUsersListResponse();
		
		List<UserDTO> resultCollection = new ArrayList<UserDTO>();
		
		resultCollection.add(new UserDTO("Michael","Williams","TL"));
		resultCollection.add(new UserDTO("Lachlan","Jago","TM"));
		resultCollection.add(new UserDTO("Ben","Trad","TM"));
		
		response.setUserList(resultCollection);
		
		return response;
	}
}