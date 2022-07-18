package com.crocoder.sport.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.crocoder.sport.models.Matche;
import com.crocoder.sport.models.Role;

public interface  RoleRepo extends  JpaRepository<Role, Integer>{

}
