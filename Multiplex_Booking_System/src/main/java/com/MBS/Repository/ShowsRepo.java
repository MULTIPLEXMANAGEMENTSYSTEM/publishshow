 package com.MBS.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.MBS.Model.Shows;
@Repository
public interface ShowsRepo extends JpaRepository<Shows,Integer> {
	@Query("select e from Shows e where e.movieName=:movieName")
	List<Shows>FindShowsByMovieName(@Param("movieName")String movieName);


	
	/*
	 * @Query("select e from Shows e where e.starttime=:starttime")
	 * List<Shows>FindShowsByStarttime(@Param("starttime")String starttime);
	 * 
	 * @Query("select e from Shows e where e.fromDate=:fromDate")
	 * List<Shows>FindShowsByFromDate(@Param("fromDate")Date fromDate);
	 * 
	 * @Query("select e from Shows e where e.toDate=:toDate")
	 * List<Shows>FindShowsByToDate(@Param("toDate")Date toDate);
	 * 
	 */

	
}
