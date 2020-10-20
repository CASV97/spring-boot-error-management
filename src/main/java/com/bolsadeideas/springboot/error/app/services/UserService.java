package com.bolsadeideas.springboot.error.app.services;

import java.util.List;

import com.bolsadeideas.springboot.error.app.models.domain.User;

public interface UserService {
	public abstract List<User> getUsers();

	public abstract User getUserById(Integer id);

}
