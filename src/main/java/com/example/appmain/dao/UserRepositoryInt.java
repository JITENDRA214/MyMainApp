package com.example.appmain.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.appmain.beans.User;

public interface UserRepositoryInt extends JpaRepository<User, Long>  {

}
