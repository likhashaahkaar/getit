package com.getit.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.getit.converter.Converter;
import com.getit.dao.RegistrationDao;
import com.getit.dto.UserDto;
import com.getit.entity.User;
import com.getit.service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private RegistrationDao registrationDao;
	@Override
	public UserDto registerUser(UserDto dto) {
		User user=Converter.dtoToUser(dto);
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return Converter.userToDto(registrationDao.registerUser(user));
	}

}
