package com.tnt.manager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import com.tnt.db.VehicleDAO;
import com.tnt.model.BookingModel;
import com.tnt.model.Vehicle;
import com.tnt.model.VehicleStatus;


public class VehicleManager extends Manager
{
	Scanner scan = new Scanner(System.in);
	VehicleDAO vehicleDao = new VehicleDAO();
	public static List<VehicleStatus> vehiclesStatus;

	@Override
	public BookingModel performStage(BookingModel booking) {
	
		System.out.println("Onward Vehicle Booking: ");
		System.out.println("---------------------- ");
		Vehicle onwardVehicle = chooseTransportation(booking.getFromCity(), booking.getDestinationCity(), booking.getStartDate(), 
				booking.getNumberOfPeople());

		System.out.println("Return Vehicle Booking: ");
		System.out.println("---------------------- ");
	
		Vehicle returnVehicle = chooseTransportation(booking.getDestinationCity(),booking.getFromCity(), booking.getEndDate(),
				booking.getNumberOfPeople());
		booking.setOnwardvehicle(onwardVehicle);
		booking.setReturnvehicle(returnVehicle);
		
		
		
		return booking;

	}
	

	public Vehicle chooseTransportation(String fromCity, String toCity, Date date, int noOfPeople)
	{
		//
		//get all vehicles and display
		List<String> vehicleTypeList = vehicleDao.vehicleTypes();
		for (int i = 0; i<vehicleTypeList.size(); i++)
    	{
    		System.out.println((i+1)+"."+vehicleTypeList.get(i));
    	}
		
		//accept a vehicle type
		System.out.println("please choose a vehicle type");
		int selectedOptionVehicleType = scan.nextInt();
		String selectedVehicleType = vehicleTypeList.get(selectedOptionVehicleType-1);
		//get all vehicles for the given vehicle type and from and to cities
		List<Vehicle> vehicleList = vehicleDao.findVehileByVehicleType(selectedVehicleType, fromCity, toCity);
		// display all vehicles
		for (int i = 0; i<vehicleList.size(); i++)
    	{
			Vehicle vehicle = vehicleList.get(i);
    		System.out.println((i+1)+"."+ vehicle.getTransportName() + "-"+ vehicle.getVehicleNo() 
    		+"-"+ vehicle.getCost());
    	}
		//
		System.out.println("please choose a " + selectedVehicleType);
		int selectedVehicleNo = scan.nextInt();
		Vehicle selectedVehicle = vehicleList.get(selectedVehicleNo-1);
		//get seat no for selected vehicle
		int[] seatNosBooked = allotSeatNumbers(selectedVehicle, date, noOfPeople);
		//display seat
		//System.out.println("YOu are alloted seat :" + seatNosBooked);
		selectedVehicle.setSeatNo(seatNosBooked);
		return selectedVehicle;
		
	}
	
	
	/**
	 * 
	 * 
	 * 
	 * @param vehicle
	 * @param date
	 * @param noOfPeople
	 * @return
	 */
	private int[] allotSeatNumbers(Vehicle vehicle, Date date, int noOfPeople){
			
		//Check in the list if the record found for the given vehicle.vehicleNo() and above date
		if(VehicleManager.vehiclesStatus==null){
			VehicleManager.vehiclesStatus = new ArrayList();
		}
		List<VehicleStatus> vehiclesStatus = VehicleManager.vehiclesStatus;
		VehicleStatus curVehicleStatus = new VehicleStatus();
		int vehiclePosition=-1;
		int[] seats;
		for(int i = 0;i< vehiclesStatus.size(); i++)
		{
			curVehicleStatus = vehiclesStatus.get(i);
			
			if(curVehicleStatus.getVehicleNo().equals(vehicle.getVehicleNo()) 
					&& curVehicleStatus.getTravelDate().equals(date))
        	{
				vehiclePosition=i;
				break;
        	}
		}
		
		//if no record, create the new record
		if(vehiclePosition<0)
		{	
			curVehicleStatus = new VehicleStatus();
			curVehicleStatus.setTravelDate(date);
			curVehicleStatus.setVehicleNo(vehicle.getVehicleNo());
		
			seats= new int[vehicle.getNoOfSeats()];
			
			for (int i = 0; i < vehicle.getNoOfSeats(); i++)
			{
				seats[i] = 0;
			}
			curVehicleStatus.setSeatsStatus(seats);
		}
		
		seats = curVehicleStatus.getSeatsStatus();
		
	
		int[] allottedSeats = bookSeats(curVehicleStatus.getSeatsStatus(), noOfPeople);
		
		for(int i=0; i< noOfPeople; i++)
		{
			seats[allottedSeats[i]-1] =1;
		}
		
		curVehicleStatus.setSeatsStatus(seats);
		
		if(vehiclePosition<0)
		{
			VehicleManager.vehiclesStatus.add(curVehicleStatus);
		}
		else{
			VehicleManager.vehiclesStatus.set(vehiclePosition, curVehicleStatus);
		}
					
		return allottedSeats;
	}
	
	private int[] bookSeats(int[] seats, int noOfSeats) 
	{
		int[] allottedSeats = new int[noOfSeats];
		int count =0;
		for (int i = 0; i < 40; i++) 
		{
			if(count >= noOfSeats){
				return allottedSeats;
			}
			if (seats[i] == 0 ) 
			{
				seats[i] = 1;
				allottedSeats[count] =  i+1;
				count ++;
			}
		}
		System.out.println("allottedSeats >>> "+ allottedSeats);

		return allottedSeats;
	}


}
