package com.tnt.model;
import java.util.Date;
public class VehicleStatus {
	
	String vehicleNo;
	Date travelDate;
	int[] seatsStatus;
	
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	public int[] getSeatsStatus() {
		return seatsStatus;
	}
	public void setSeatsStatus(int[] seatsStatus) {
		this.seatsStatus = seatsStatus;
	}
	
}
