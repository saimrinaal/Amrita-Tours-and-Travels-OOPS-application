package com.tnt.model;

import java.util.Date;

public class BookingModel {
	private String name;
	private String fromCity;
	private String destinationCity;
	private int numberOfPeople;
	private Date startDate;
	private Date endDate;
	private Vehicle onwardvehicle;
	private Vehicle returnvehicle;
	private Hotel hotel;
	
	public BookingModel(String name, String fromCity, String destinationCity, int numberOfPeople, 
			Date startDate, Date endDate){
		this.name=name;
		this.fromCity =fromCity;
	    this.destinationCity=destinationCity;
	    this.numberOfPeople=numberOfPeople;
		this.startDate=startDate;
		this.endDate=endDate;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getDestinationCity() 
	{
		return destinationCity;
	}
	public void setDestinationCity(String destinationCity) 
	{
		this.destinationCity = destinationCity;
	}
	public int getNumberOfPeople() 
	{
		return numberOfPeople;
	}
	public void setNumberOfPeople(int numberOfPeople) 
	{
		this.numberOfPeople = numberOfPeople;
	}
	public Date getStartDate() 
	{
		return startDate;
	}
	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}
	public Date getEndDate() 
	{
		return endDate;
	}
	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
	}
	public Hotel getHotel() 
	{
		return hotel;
	}
	public void setHotel(Hotel hotel) 
	{
		this.hotel = hotel;
	}
	public String getFromCity() {
		return fromCity;
	}
	public Vehicle getOnwardvehicle() {
		return onwardvehicle;
	}
	public void setOnwardvehicle(Vehicle onwardvehicle) {
		this.onwardvehicle = onwardvehicle;
	}
	public Vehicle getReturnvehicle() {
		return returnvehicle;
	}
	public void setReturnvehicle(Vehicle returnvehicle) {
		this.returnvehicle = returnvehicle;
	}
}
