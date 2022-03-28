package com.MBS;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.MBS.Model.Shows;
import com.MBS.Repository.ShowsRepo;
import com.MBS.Service.ShowsService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminTest1 {
	@MockBean
	private ShowsRepo repo;
	@Autowired
	private ShowsService service;
	@Test
	public void saveShows() {

		Shows obj = new Shows(2,"RRR" ,LocalDate.parse("2022-03-26"),LocalDate.parse("2022-03-27"),LocalTime.parse("06:00:00"),LocalTime.parse("08:00:00"));
	when(repo.save(obj)).thenReturn(obj);
	assertEquals(obj,service.addShows(obj));
	
	}			
}
