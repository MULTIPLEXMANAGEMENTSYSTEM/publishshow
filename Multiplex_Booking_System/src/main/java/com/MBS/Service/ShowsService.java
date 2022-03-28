package com.MBS.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.MBS.Model.Shows;
import com.MBS.Repository.ShowsRepo;

@Service 
@Transactional
@Component
public class ShowsService {

@Autowired
  ShowsRepo repo;
public Shows addShows(Shows e) {
	 return repo.save(e);
}

public List<Shows> FindShowsByMovieName(String movieName) {
	return repo.FindShowsByMovieName(movieName);
	
}
/*
 * public List<Shows> FindShowsByStarttime(String starttime) { List<Shows> show
 * = repo.FindShowsByStarttime(starttime); return show; } public List<Shows>
 * FindShowsByFromDate(Date fromDate){ return
 * repo.FindShowsByFromDate(fromDate);
 * 
 * } public List<Shows> FindShowsByToDate(Date toDate){ return
 * repo.FindShowsByToDate(toDate);
 * 
 * }
 */

public Optional<Shows> findByShowId(int showId) {
	// TODO Auto-generated method stub
	return repo.findById(showId);
}

public void updateByShowId(Shows show) {
	// TODO Auto-generated method stub
	repo.save(show);
	
}


	
}





