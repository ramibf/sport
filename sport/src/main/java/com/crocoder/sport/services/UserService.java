package com.crocoder.sport.services;

import com.crocoder.sport.models.User;

public interface UserService {
	public User signup(User user);

	public User login(String email, String pwd);

}
