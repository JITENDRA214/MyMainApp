package com.example.appmain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.appmain.beans.User;
import com.example.appmain.dao.UserDaoImp;

@Service
@Component
public class UserServiceImp implements UserServiceInt {

	@Autowired
	private UserDaoImp userDaoImp;

	@Override
	public List<User> getAllUsers() {
		return userDaoImp.getAllUser();
	}

	@Override
	public Optional<User> getAllUserById(long userId) {
		return userDaoImp.getUserById(userId);
	}

	@Override
	public void saveUser(User user) {
		userDaoImp.createUser(user);
	}

	@Override
	public void updateUserService(User user, long userId) {
		userDaoImp.updateUser(user, userId);
	}

	@Override
	public void deleteUserService(long userId) {
		userDaoImp.deleteUser(userId);

	}
}
