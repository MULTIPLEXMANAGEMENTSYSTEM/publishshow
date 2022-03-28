package com.MBS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MBS.Model.MovieName;
import com.MBS.Repository.MovieNameRepo;

@Service
public class MovieNameService {
	@Autowired
	MovieNameRepo repo;

	public List<MovieName> findByName(String name) {
		
		return repo.findByName(name);
	}
	


}
