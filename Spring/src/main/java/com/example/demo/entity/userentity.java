package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class userentity {
	@Id
	private int ticketid;
	private String moviename;
	private int screenno;
	private String theatrename;
	private int noofticket;
	private int ticketprice;
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public int getScreenno() {
		return screenno;
	}
	public void setScreenno(int screenno) {
		this.screenno = screenno;
	}
	public String getTheatrename() {
		return theatrename;
	}
	public void setTheatrename(String theatrename) {
		this.theatrename = theatrename;
	}
	public int getNoofticket() {
		return noofticket;
	}
	public void setNoofticket(int noofticket) {
		this.noofticket = noofticket;
	}
	public int getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(int ticketprice) {
		this.ticketprice = ticketprice;
	}
	public userentity(int ticketid, String moviename, int screenno, String theatrename, int noofticket,
			int ticketprice) {
		super();
		this.ticketid = ticketid;
		this.moviename = moviename;
		this.screenno = screenno;
		this.theatrename = theatrename;
		this.noofticket = noofticket;
		this.ticketprice = ticketprice;
	}
	public userentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
