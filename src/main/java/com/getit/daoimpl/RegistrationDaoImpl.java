package com.getit.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getit.dao.RegistrationDao;
import com.getit.entity.User;
import com.getit.repository.UserRepository;

@Service
public class RegistrationDaoImpl implements RegistrationDao {

	@Autowired
	private UserRepository userRepository;
	
	public User registerUser(User user) {
		return userRepository.insert(user);
	}
}
