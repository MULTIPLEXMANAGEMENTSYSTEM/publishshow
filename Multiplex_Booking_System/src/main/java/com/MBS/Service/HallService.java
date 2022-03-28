 package com.MBS.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.MBS.Model.Hall;
import com.MBS.Repository.HallRepo;

@Service
@Transactional
public class HallService {
	@Autowired
	HallRepo repo;

	public Optional<Hall> findByHallId(int hallId) {
	
		return repo.findById(hallId);
	}

	public Hall updateByHallId(Hall hall) {
		return repo.save(hall);
		
	}

	

}
 