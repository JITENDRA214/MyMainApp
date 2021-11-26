package com.example.appmain.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.appmain.beans.User;

@Repository
public class UserDaoImp {

	@Autowired
	private UserRepositoryInt userRepositoryInt;

	public void createUser(User user) {
		userRepositoryInt.save(user);
	}

	public List<User> getAllUser() {
		return userRepositoryInt.findAll();
	}

	public Optional<User> getUserById(long userId) {
		return userRepositoryInt.findById(userId);
	}

	public void updateUserRepository(User user, long userId) {
		userRepositoryInt.save(user);
	}

	public void updateUser(User updateUser, long userid) {
		User newUser = new User();
		newUser.setUserId(userid);
		newUser.setUserName(updateUser.getUserName());
		newUser.setUserPassword(updateUser.getUserPassword());
		userRepositoryInt.save(newUser);
	}

	public void deleteUser(long userId) {
		userRepositoryInt.deleteById(userId);
	}

}