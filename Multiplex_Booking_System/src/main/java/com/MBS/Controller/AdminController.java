  package com.MBS.Controller; 


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MBS.Exception.ResourceNotFoundException;
import com.MBS.Model.Hall;
import com.MBS.Model.MovieName;
import com.MBS.Model.Shows;
import com.MBS.Service.HallService;
import com.MBS.Service.MovieNameService;
import com.MBS.Service.ShowsService;

@RestController
@RequestMapping("/shows")

public class AdminController {
	@Autowired
	ShowsService service;
	@Autowired
	MovieNameService service1;
	@Autowired
	HallService service2;

	@PostMapping("/Shows")

	public ResponseEntity<String> addShows(@RequestBody Shows e) {
		Shows show = service.addShows(e);
		System.out.println(e);
		return new ResponseEntity<String>("Record inserted successfully", HttpStatus.OK);

	}

	@GetMapping("/fetchByMovieName/{movieName}")
	public ResponseEntity<List<Shows>> fetchByMovieName(@PathVariable String movieName) { 
		System.out.println(movieName);
		List<Shows> obj = service.FindShowsByMovieName(movieName);
		System.out.println(obj);
		return new ResponseEntity<List<Shows>>(obj, HttpStatus.OK);
	}

	@PutMapping("/updateByHallId")
	public ResponseEntity<String> updateByHallId(@Validated @RequestBody Hall hall) {

		String status = null;
		Optional<Hall> obj = service2.findByHallId(hall.getHallId());
		obj.get().setHallId(hall.getHallId());
		if (obj.isPresent()) {
			service2.updateByHallId(hall);

			status = "Successfully updated";
		} else {
			throw new ResourceNotFoundException("HallId is not available");
		}
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}
	@PutMapping("/updateByShowId")
	public ResponseEntity<String> updateByShowId(@Validated @RequestBody Shows show) {

		String status = null;
		Optional<Shows> obj = service.findByShowId(show.getShowId());
		obj.get().setShowId(show.getShowId());
		if (obj.isPresent()) {
			service.updateByShowId(show);

			status = "Successfully updated";
		} else {
			throw new ResourceNotFoundException("ShowId is not available");
		}
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}

	@GetMapping("/fetchByName/{name}")
	public ResponseEntity<List<MovieName>> fetchByName(@PathVariable String name) {
		System.out.println(name);
		List<MovieName> obj = service1.findByName(name);
		System.out.println(obj);
		return new ResponseEntity<List<MovieName>>(obj, HttpStatus.OK);
	}

	/*
	 * @GetMapping("/fetchByDate/{fromDate}") public ResponseEntity<List<Shows>>
	 * fetchByDate(@PathVariable Date fromDate){ List<Shows> obj =
	 * service.FindShowsByFromDate( fromDate); System.out.println(obj); return new
	 * ResponseEntity<List<Shows>>(obj, HttpStatus.OK); }
	 * 
	 * @GetMapping("/fetchByToDate/{toDate}") public ResponseEntity<List<Shows>>
	 * fetchByToDate(@PathVariable Date toDate){ List<Shows> obj =
	 * service.FindShowsByToDate( toDate); System.out.println(obj); return new
	 * ResponseEntity<List<Shows>>(obj, HttpStatus.OK); }
	 */
}
