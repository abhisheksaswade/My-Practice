package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.AuthenticationDto;
import com.app.pojos.User;
import com.app.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public List<User> getAllUserDetails() {
		return userRepo.findAll();
	}

	@Override
	public Optional<User> getUserDetails(Long userId) {

		return userRepo.findById(userId);
	}

	@Override
	public User addUserDetails(User transientUser) {

		return userRepo.save(transientUser);
	}

	@Override
	public User updateUserDetails(User detachedUser) {

		return userRepo.save(detachedUser);
	}

	@Override
	public String deleteUserDetails(Long userId) {
		
		if(userRepo.existsById(userId))
		{
			userRepo.deleteById(userId);
			return "delete operation is successful.......";
		}

		return "delete operation is failed.......";
		
	}

	@Override
	public String authenticateUser(AuthenticationDto dto) {
		
		if((userRepo.findByEmailAndPassword(dto.getEmail(), dto.getPassword())).isPresent())
		{
			return "authentication is successful";
		}
		
		return "authentication is failed";
	}

}
