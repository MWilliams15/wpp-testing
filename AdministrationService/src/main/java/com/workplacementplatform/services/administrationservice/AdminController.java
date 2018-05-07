package com.workplacementplatform.services.administrationservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workplacementplatform_poc.contracts.administration.GetUsersListResponse;






@RestController
@RequestMapping("/Admin")
public class AdminController {
    @GetMapping("/GetUsersList")
    public GetUsersListResponse GetUsersList() {
    	
    	AdministrationService service = new AdministrationService();
    	return service.GetUsersList();
    	
    }
    

}