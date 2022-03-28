package com.MBS;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.MBS.Model.MovieName;
import com.MBS.Repository.MovieNameRepo;
import com.MBS.Service.MovieNameService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminTest {
	@MockBean
	private MovieNameRepo repo;

	@Autowired
	private MovieNameService service1;

	@Test
	public void getByName() {
		String name = "RRR";
		
when(repo.findByName(name))
		.thenReturn(Stream.of(new MovieName("RRR", "action", "ram")).collect(Collectors.toList()));
	
	assertEquals(1, service1.findByName(name).size());
	}
}
	
	
	


