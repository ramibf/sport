package com.crocoder.sport.services;


	import java.util.List;
	import java.util.Optional;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.crocoder.sport.models.Player;

import com.crocoder.sport.repositories.PlayerRepo;


	@Service
	public class PlayerServiceImpl implements PlayerService {
	@Autowired
	public PlayerRepo playerRepo;
	@Override
	public List<Player> getAllPlayers() {
	return playerRepo.findAll() ;
	}
	@Override
	public  Player update(Player player) {
	return playerRepo.save(player);
	}
	@Override
	public void delete(Integer id) {
		playerRepo.deleteById(id);
	}@Override
	public Player add(Player player) {
	return playerRepo.save(player);
	}
	@Override
	public Player findById(Integer id) {
	Optional<Player> Player = playerRepo.findById(id);
	 return Player.isPresent() ? Player.get() : null;
	}


}
