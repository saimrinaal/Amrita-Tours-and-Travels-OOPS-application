package com.tnt.model;

public class Hotel {
	private String hotelName;
	private String hotelRating;
	private String city;
	private double cheakInTime;
	private double costPerDay;
	
public Hotel(){
		
	}
	public Hotel(String hotelName, String hotelRating, String city, double cheakInTime, double costPerDay)
	{
		this.hotelName=hotelName;
	    this.hotelRating=hotelRating;
	    this.city=city;
		this.cheakInTime=cheakInTime;
		this.costPerDay=costPerDay;
	}

	public String getHotelName() 
	{
		return hotelName;
	}
	
	public void setHotelName(String hotelName) 
	{
		this.hotelName = hotelName;
	}
	
	public String getHotelRating() 
	{
		return hotelRating;
	}
	
	public void setHotelRating(String hotelRating) 
	{
		this.hotelRating = hotelRating;
	}
	
	public String getCity() 
	{
		return city;
	}
	
	public void setCity(String city) 
	{
		this.city = city;
	}
	
	public double getCheakInTime()
	{
		return cheakInTime;
	}
	
	public void setCheakInTime(double cheakInTime)
	{
		this.cheakInTime=cheakInTime;
	}
	
	public double getCostPerDay()
	{
		return costPerDay;
	}
	
	public void setCostPerDay(double costPerDay)
	{
		this.costPerDay=costPerDay;
	}
}
