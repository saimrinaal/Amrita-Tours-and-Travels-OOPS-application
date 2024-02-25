package com.tnt.manager;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.tnt.db.CommonDAO;
import com.tnt.model.BookingModel;
import com.tnt.model.Hotel;
import com.tnt.model.Vehicle;
public class BookingManager{

	Manager vehicleManager = new VehicleManager();
	Manager hotelManager = new HotelManager();
	Booking_pro reserveHotelRoom = new Booking_pro();
	Scanner scan = new Scanner(System.in);
	CommonDAO CommonDao = new CommonDAO();
	BookingModel booking;

	public void displayGuide(String city){
		
		if (city.equals("PANAJI")){
			
			new Panaji();
		}
		if (city.equals("DELHI")){
			
			new Delhi();
		}
		if (city.equals("MYSORE")){
			
			new Mysore();
		}
		if (city.equals("KOCHI")){
			
			new Kochi();
		}
		if (city.equals("KOLKATA")){
			
			new Kolkata();
		}
		if (city.equals("CHENNAI")){
			
			new Chennai();
		}
	}
	
	public void executeBooking(){
		BookingModel booking = getPriliminaryDetails();
		booking = vehicleManager.performStage(booking);
		booking = hotelManager.performStage(booking);
		reserveHotelRoom.reserveHotelRoom();
		displayBookingBill(booking);
		
		displayGuide(booking.getDestinationCity());
		
		System.out.println("Any More Booking (Y/N)");
		
		String flag = scan.next();
		if(flag.equalsIgnoreCase("Y")){
			executeBooking();
		}
		else{
			new FeedbackManager().acceptFeedback(booking.getName());
			System.out.println("Thank you for visiting Amrita Tours & Travels Booking system, Bye..");
			}
		System.out.print("Enter PassengerId for viewing Passenger History");
		int sel= scan.nextInt();
		PassengerHistory ph = new PassengerHistory();
		ph.PassengerCheck(sel);
	}
	
	
	
	public void displayBookingBill(BookingModel booking){
		String paymentMode = new Payment().getPayment();
		Vehicle onwardVehicle = booking.getOnwardvehicle();

		Vehicle returnVehicle = booking.getReturnvehicle();
	
		Hotel hotel = booking.getHotel();
		
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
		String startDate = formatter.format(booking.getStartDate());
		String endDate = formatter.format(booking.getEndDate());
		float daysBetween = 0;
		try {
			Date date1 = formatter.parse(startDate);
		    Date date2 = formatter.parse(endDate);
		    long difference = date2.getTime() - date1.getTime();
		    daysBetween = (difference / (1000*60*60*24));
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("                                   Amrita Tours & Travels");
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("Date\t\t By\t From\t \tTo\t\tDep.Time\t Seat Nos.\t cost");
		System.out.println("    \t\t   \t City\t \tCity\t          \t\t");
		System.out.println("----------------------------------------------------------------------------------------------");
		
		System.out.print(startDate+"\t");
		System.out.print(onwardVehicle.getVehicleType()+"\t");
		System.out.print(onwardVehicle.getStartCity()+"\t\t");
		System.out.print(onwardVehicle.getEndCity()+"\t");
		System.out.print(onwardVehicle.getDepartureTime()+"\t\t");
		System.out.print(convertArrayToString(onwardVehicle.getSeatNo())+"\t");
		System.out.println(onwardVehicle.getCost()*booking.getNumberOfPeople()+"\t");
		System.out.print(endDate+"\t");
		System.out.print(returnVehicle.getVehicleType()+"\t");
		System.out.print(returnVehicle.getStartCity()+"\t");
		System.out.print(returnVehicle.getEndCity()+"\t\t");
		System.out.print(returnVehicle.getDepartureTime()+"\t\t");
		System.out.print(convertArrayToString(returnVehicle.getSeatNo())+"\t");
		System.out.println(returnVehicle.getCost()*booking.getNumberOfPeople()+"\t");
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("HOTEL NAME - "+hotel.getHotelName());
		System.out.println("NUMBER OF DAYS - "+daysBetween);
		System.out.println("TOTEL COST FOR THE HOTEL - "+"\t\t\t\t\t\t\t"+hotel.getCostPerDay()*daysBetween);
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("OVER ALL COST IS "+ "\t\t\t\t\t\t\t\t" + ((hotel.getCostPerDay()*daysBetween) + (onwardVehicle.getCost()*booking.getNumberOfPeople()) + (returnVehicle.getCost()*booking.getNumberOfPeople())));
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("MODE OF PAYMENT - "+paymentMode);
		System.out.println("--------------------------------------------------------------------------------------------");
	}
	
	
	public BookingModel getPriliminaryDetails()
	{
		System.out.println("plesae enter your name");
		String name = scan.next();
		
		//get from city
		List<String> startCityList = CommonDao.startCities();
		for (int i = 0; i<startCityList.size(); i++)
    	{
    		System.out.println((i+1)+"."+startCityList.get(i));
    	}
		System.out.println("please choose startCity");
		int selectedOptionStartCity = scan.nextInt();
		String startingCity = startCityList.get(selectedOptionStartCity-1);
		
		//get to city
		
		/*List<String> endCityList = CommonDao.endCities();
		for (int i = 0; i<endCityList.size(); i++)
    	{
    		System.out.println((i+1)+"."+endCityList.get(i));
    	}
		System.out.println("please choose endCity");
		int selectedOptionEndCity = scan.nextInt();
		String destinationCity = endCityList.get(selectedOptionEndCity-1);
		*/
		
		String destinationCity = new TravelAndTourism().getDestinationCity();
		//no of people
		System.out.print("please choose Number of people :");
		
		int numberOfPeople = scan.nextInt();
		//start date
		System.out.println("plesae enter start date");
		String startDateStr = scan.next();
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
		Date startDate=null;
		try 
		{
			startDate=formatter.parse(startDateStr);
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
		//end date
		System.out.println("plesae enter end date");
		String endDateStr = scan.next();
		Date endDate=null;
		try 
		{
			endDate=formatter.parse(endDateStr);
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
		
		BookingModel booking = new BookingModel(name, startingCity, destinationCity, numberOfPeople, startDate, endDate);
		return booking;
		
	}
	
	private String convertArrayToString(int[] seats){
		String seatsStr = "";
		
		for(int i=0; i< seats.length; i++){
			seatsStr += seats[i] + " "; 
		}
		return seatsStr;
	}
	

}
