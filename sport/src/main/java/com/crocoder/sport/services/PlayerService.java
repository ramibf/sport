package com.crocoder.sport.services;
import java.util.List;


import com.crocoder.sport.models.Player;


public interface PlayerService {
	public List<Player> getAllPlayers();
	public Player update(Player player);
	public void delete(Integer id);
	public Player add(Player player);
	public Player findById(Integer id);


}
