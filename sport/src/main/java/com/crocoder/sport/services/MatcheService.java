package com.crocoder.sport.services;
import java.util.List;

import com.crocoder.sport.models.Matche;


public interface MatcheService {
	public List<Matche> getAllMatches();
	public Matche update(Matche matche);
	public void delete(Integer id);
	public Matche add(Matche matche);
	public Matche findById(Integer id);


}
