package com.getit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.getit.dto.UserDto;
import com.getit.service.RegistrationService;

@RestController
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public UserDto registerUser(@RequestBody UserDto dto) {
		return registrationService.registerUser(dto);
	}
}
