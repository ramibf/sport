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


import com.crocoder.sport.models.Team;

import com.crocoder.sport.services.TeamService;

	
	@CrossOrigin("http://localhost:4200")
	@RestController
	@RequestMapping("api/team")
	public class TeamController {
	@Autowired
	private TeamService teamService;
	@GetMapping("")
	 public List<Team> getAllTeams(){
	 return teamService.getAllTeams();
	}
	 @PutMapping("/{id}")
	public Team update(@PathVariable Integer id ,@RequestBody Team team) {
	 return teamService.update(team);
	}
	 @DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
	teamService.delete(id);
	 } @PostMapping
	public Team add(@RequestBody Team team) {
	 return teamService.add(team);
	 }
	 @GetMapping("/{id}")
	public Team getTeamsById(@PathVariable Integer id) {
	return teamService.findById(id);
	}
}
