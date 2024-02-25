package com.tnt.model;

public class Vehicle {
	private String vehicleNo;
	private String transportName;
	private String startCity;
	private String endCity;
	private String vehicleType;
	private int noOfSeats;
	private double departureTime;
	private double cost;
	private int[] seatNo;
	
	public Vehicle(){
		
	}
	
	public Vehicle(String vehicleNo, String transportName, String startCity, String endCity, String vehicleType, int noOfSeats, double departureTime, double cost)
	{
		this.vehicleNo=vehicleNo;
	    this.transportName=transportName;
	    this.startCity=startCity;
		this.endCity=endCity;
		this.vehicleType=vehicleType;
		this.noOfSeats=noOfSeats;
		this.departureTime=departureTime;
		this.cost=cost;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getTransportName() {
		return transportName;
	}

	public void setTransportName(String transportName) {
		this.transportName = transportName;
	}

	public String getStartCity() {
		return startCity;
	}

	public void setStartCity(String startCity) {
		this.startCity = startCity;
	}

	public String getEndCity() {
		return endCity;
	}

	public void setEndCity(String endCity) {
		this.endCity = endCity;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public double getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(double departureTime) {
		this.departureTime = departureTime;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int[] getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int[] seatNo) {
		this.seatNo = seatNo;
	}

}
