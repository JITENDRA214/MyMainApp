package com.example.appmain.service;

import java.util.List;
import java.util.Optional;

import com.example.appmain.beans.User;


public interface UserServiceInt {
	
	public List<User> getAllUsers();

	public Optional<User> getAllUserById(long userId);

	public void saveUser(User user);

	public void updateUserService(User user, long userId);

	public void deleteUserService(long userId);

}
