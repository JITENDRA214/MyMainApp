package com.example.appmain.controller;


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

import com.example.appmain.beans.User;
import com.example.appmain.service.UserServiceInt;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceInt userServiceInt;
	
	@PostMapping("/createUser")
	public String addUser(@RequestBody User user) {
		userServiceInt.saveUser(user);
		return "record inserted successfully......";
	}

	@GetMapping("/getAllUser")
	public List<User> getUserInfo() {
		return userServiceInt.getAllUsers();
	}

	@GetMapping("getUser/{userId}")
	public Optional<User> getUserById(@PathVariable long userId) {
		return userServiceInt.getAllUserById(userId);
	}

	@PutMapping("updateUser/{userId}")
	public String updateUser(@RequestBody User updatedUser, @PathVariable long userId) {
		userServiceInt.updateUserService(updatedUser, userId);
		return "Record Updated successfully......";
	}

	@DeleteMapping("deleteUser/{userId}")
	public String deleteUser(@PathVariable long userId) {
		userServiceInt.deleteUserService(userId);
		return "Record deleted successfully..";
	}

}
