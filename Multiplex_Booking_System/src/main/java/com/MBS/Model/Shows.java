  package com.MBS.Model;


import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



@Entity

public class Shows {

@Id	
private int showId;
private String movieName;
@Column(name="FROM_DATE")

private LocalDate fromDate;

@Column(name="TO_DATE")

private LocalDate toDate;

@Column(name="START_TIME")

private LocalTime starttime;

@Column(name="END_TIME")

private LocalTime endtime;

@OneToOne
@JoinColumn(name="hall_id")
private Hall hall;
 
public int getShowId() {
	return showId;
}
public void setShowId(int showId) {
	this.showId = showId;
}


public LocalDate getFromDate() {
	return fromDate;
}
public void setFromDate(LocalDate fromDate) {
	this.fromDate = fromDate;
}
public LocalDate getToDate() {
	return toDate;
}
public void setToDate(LocalDate toDate) {
	this.toDate = toDate;
}
public LocalTime getStarttime() {
	return starttime;
}
public void setStarttime(LocalTime starttime) {
	this.starttime = starttime;
}
public LocalTime getEndtime() {
	return endtime;
}
public void setEndtime(LocalTime endtime) {
	this.endtime = endtime;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}

public Hall getHall() {
	return hall;
}
public void setHall(Hall hall) {
	this.hall = hall;
}
public Shows(int showId,String movieName,LocalDate fromDate,LocalDate toDate,LocalTime starttime,LocalTime endtime) {
	super();
	this.showId=showId;
	this.movieName=movieName;
	this.fromDate=fromDate;
	this.toDate=toDate;
	this.starttime=starttime;
	this.endtime=endtime;
	
}
public Shows() {
	super();
}


@Override
public String toString() {
	return "Shows [showId=" + showId + ", movieName=" + movieName + ", fromDate=" + fromDate + ", toDate=" + toDate
			+ ", starttime=" + starttime + ", endtime=" + endtime + ",hall="+hall+"]";
}

}



 