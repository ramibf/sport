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

import com.crocoder.sport.models.Matche;
import com.crocoder.sport.services.MatcheService;

	
	@CrossOrigin("http://localhost:4200")
	@RestController
	@RequestMapping("api/matches")
	public class MatcheController {
	@Autowired
	private MatcheService matcheService;
	@GetMapping("")
	 public List<Matche> getAllMatches(){
	 return matcheService.getAllMatches();
	}
	 @PutMapping("/{id}")
	public Matche update(@PathVariable Integer id ,@RequestBody Matche matche) {
	 return matcheService.update(matche);
	}	
	 @DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
	matcheService.delete(id);
	 } 
	 @PostMapping
	public Matche add(@RequestBody Matche matche) {
	 return matcheService.add(matche);
	 }
	 @GetMapping("/{id}")
	public Matche getClientsById(@PathVariable Integer id) {
	return matcheService.findById(id);
	}
}
