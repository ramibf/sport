package com.crocoder.sport.services;


	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.crocoder.sport.models.User;
import com.crocoder.sport.repositories.UserRepo;

	@Service
	public class UserServiceImpl implements UserService {
	@Autowired
	public UserRepo userRepo;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Override
	public User signup(User user) {
		String password = user.getPwd();
    	user.setPwd(bCryptPasswordEncoder.encode(password));
	return userRepo.save(user) ;
	}
	@Override
	public User login(String email,String pwd) {
	return userRepo.findUserByEmailAndPwd(email,pwd)	;
			}
	

}
