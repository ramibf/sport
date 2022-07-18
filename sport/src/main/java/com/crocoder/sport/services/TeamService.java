package com.crocoder.sport.services;
import java.util.List;


import com.crocoder.sport.models.Team;


public interface TeamService {
	public List<Team> getAllTeams();
	public Team update(Team team);
	public void delete(Integer id);
	public Team add(Team team);
	public Team findById(Integer id);


}
