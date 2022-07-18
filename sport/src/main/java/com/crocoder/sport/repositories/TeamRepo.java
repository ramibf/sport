package com.crocoder.sport.repositories;
import org.springframework.data.jpa.repository.JpaRepository;


import com.crocoder.sport.models.Team;

public interface  TeamRepo extends  JpaRepository<Team, Integer>{

}
