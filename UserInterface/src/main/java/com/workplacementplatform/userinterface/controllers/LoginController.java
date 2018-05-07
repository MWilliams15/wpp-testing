package com.workplacementplatform.userinterface.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.workplacementplatform.services.AuthenticationService;
import com.workplacementplatform.userinterface.models.LoginModel;


@Controller
@RequestMapping("/Login")
public class LoginController {

    @GetMapping("")
    public String index() {
        return "Login/Index";
    }
    
    @GetMapping("/Authenticate")
    public String authenticate(LoginModel loginModel,Model model) {
    	AuthenticationService service = new AuthenticationService();
    	
    	if(service.AuthenticateUser(loginModel.getUserName(), loginModel.getPassword())) {
    		return "redirect:Home";
    	}
    	else {
    		return "Login/Error";
    	}
    	
    }
    

}