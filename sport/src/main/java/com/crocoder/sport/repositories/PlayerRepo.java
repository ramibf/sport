package com.crocoder.sport.repositories;
import org.springframework.data.jpa.repository.JpaRepository;


import com.crocoder.sport.models.Player;

public interface  PlayerRepo extends  JpaRepository<Player, Integer>{

}
