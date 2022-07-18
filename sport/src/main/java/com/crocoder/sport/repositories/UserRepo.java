package com.crocoder.sport.repositories;
import org.springframework.data.jpa.repository.JpaRepository;


import com.crocoder.sport.models.User;

public interface  UserRepo extends  JpaRepository<User, Integer>{
	 User findUserByEmailAndPwd(String email,String pwd)	;
	 User findUserByEmail(String email)	;
}
