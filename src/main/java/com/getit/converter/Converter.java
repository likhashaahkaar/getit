package com.getit.converter;

import com.getit.dto.UserDto;
import com.getit.entity.User;

public class Converter {

	public static User dtoToUser(UserDto dto) {
		if(dto==null)
			return null;
		User user=new User();
		user.setPassword(dto.getPassword());
		user.setEmail(dto.getEmail());
		return user;
	}
	
	
	public static UserDto userToDto(User user) {
		if(user==null)
			return null;
		UserDto dto=new UserDto();
		dto.setEmail(user.getEmail());
		dto.setPassword(user.getPassword());
		dto.setUserId(user.getUserId());
		return dto;
	}
}
