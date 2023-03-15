package com.app.core;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.AuthenticationDto;
import com.app.pojos.User;
import com.app.service.UserService;



@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	private UserService userServ;
	
	@GetMapping
	public List<User> getAllUsers()
	{
		return userServ.getAllUserDetails();
	}
	
	
	@GetMapping("/{userId}")
	public Optional<User> getUser(@PathVariable Long userId)
	{
		return userServ.getUserDetails(userId);
	}
	
	@PostMapping
	public User addUser(@RequestBody User transientUser)
	{
		return userServ.addUserDetails(transientUser);
	}
	
	@PostMapping("/Login")
	public String login(@RequestBody AuthenticationDto dto)
	{
		return userServ.authenticateUser(dto);
	}
	
	
	@PutMapping
	public User updateUser(@RequestBody User detachedUser)
	{
		return userServ.updateUserDetails(detachedUser);
	}
	
	@DeleteMapping("/{userId}}")
	public String deleteUser(@PathVariable Long userId)
	{
		return userServ.deleteUserDetails(userId);
	}

}
