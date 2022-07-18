package com.crocoder.sport.controllers;


	import java.util.List;
	//import org.springframework.beans.factory.annotation.Autowired(required=true);
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.crocoder.sport.models.Player;

import com.crocoder.sport.services.PlayerService;


	
	@CrossOrigin("http://localhost:4200")
	@RestController
	@RequestMapping("api/player")
	public class PlayerController {
	@Autowired
	private PlayerService playerService;
	@GetMapping("")
	 public List<Player> getAllPlayers(){
	 return playerService.getAllPlayers();
	}
	 @PutMapping("/{id}")
	public Player update(@PathVariable Integer id ,@RequestBody Player player) {
	 return playerService.update(player);
	}
	 @DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		 playerService.delete(id);
	 } @PostMapping
	public Player add(@RequestBody Player player) {
	 return playerService.add(player);
	 }
	 @GetMapping("/{id}")
	public Player getPlayersById(@PathVariable Integer id) {
	return playerService.findById(id);
	}
}
