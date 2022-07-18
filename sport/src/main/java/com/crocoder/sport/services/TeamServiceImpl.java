package com.crocoder.sport.services;


	import java.util.List;
	import java.util.Optional;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;


import com.crocoder.sport.models.Team;
import com.crocoder.sport.repositories.TeamRepo;

	@Service
	public class TeamServiceImpl implements TeamService {
	@Autowired
	public TeamRepo teamRepo;
	@Override
	public List<Team> getAllTeams() {
	return teamRepo.findAll() ;
	}
	@Override
	public Team update(Team team) {
	return teamRepo.save(team);
	}
	@Override
	public void delete(Integer id) {
		teamRepo.deleteById(id);
	}@Override
	public Team add(Team team) {
	return teamRepo.save(team);
	}
	@Override
	public Team findById(Integer id) {
	Optional<Team> Team = teamRepo.findById(id);
	 return Team.isPresent() ? Team.get() : null;
	}


}
