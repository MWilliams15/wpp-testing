package com.workplacementplatform.userinterface.controllers;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.workplacementplatform_poc.contracts.administration.GetUsersListResponse;


@Controller
@RequestMapping("/Admin")
public class AdminController {

	@Value("${services.administration.url}")
	private String administrationServiceUrl;
	
    @GetMapping("/ManageUsers")
    public String ManageUsers() {
        return "Admin/ManageUsers";
    }
    
    @ResponseBody
    @GetMapping("/GetUsersList")
    public GetUsersListResponse GetUsersList() {
    	
    	RestTemplate template = new RestTemplate();
    	HttpHeaders httpHeaders = new HttpHeaders();
    	httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
    	HttpEntity<String> httpEntity = new HttpEntity<String>(httpHeaders);
    	
    	
    	String url = administrationServiceUrl + "Admin/GetUsersList";
    	
    	ResponseEntity<String> response = template.exchange(url,HttpMethod.GET, httpEntity, String.class);
    	
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		GetUsersListResponse responseList = mapper.readValue(response.getBody(), GetUsersListResponse.class);
    		return responseList;
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
  /*  	AdministrationService service = new AdministrationService();
    	return service.GetUsersList();*/
    	
    	return new GetUsersListResponse();
    	
    }
    

}