package com.crocoder.sport.services;


	import java.util.List;
	import java.util.Optional;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.crocoder.sport.models.Matche;
import com.crocoder.sport.repositories.MatcheRepo;

	@Service
	public class MatcheServiceIImpl implements MatcheService {
	@Autowired
	public MatcheRepo matcheRepo;
	@Override
	public List<Matche> getAllMatches() {
	return matcheRepo.findAll() ;
	}
	@Override
	public Matche update(Matche matche) {
	return matcheRepo.save(matche);
	}
	@Override
	public void delete(Integer id) {
		matcheRepo.deleteById(id);
	}@Override
	public Matche add(Matche matche) {
	return matcheRepo.save(matche);
	}
	@Override
	public Matche findById(Integer id) {
	Optional<Matche> Matche = matcheRepo.findById(id);
	 return Matche.isPresent() ? Matche.get() : null;
	}


}
