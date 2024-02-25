package com.tnt.db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.tnt.model.Hotel;
import com.tnt.model.Vehicle;
import com.tnt.model.Hotel;

public class HotelDAO {
	private List<Hotel> HotelList = new ArrayList<>();
	
	public HotelDAO()
	{
		HotelsData();
	}
	public void HotelsData(){
		try{
			
			Hotel hotel = new Hotel();
		    
			File file = new File(".");
			BufferedReader reader = new BufferedReader(new FileReader(new File(".").getAbsoluteFile() + "/src/resources/"+"hotel.csv"));
		    String line = "";
		    while ((line = reader.readLine())!=null){
		        String[] split = line.split(",");
		        hotel = new Hotel();
		        hotel.setHotelName(split[0]);
		        hotel.setHotelRating(split[1]);
		        hotel.setCity(split[2]);
		        hotel.setCheakInTime(Double.parseDouble(split[3]));
		        hotel.setCostPerDay(Double.parseDouble(split[4]));
		        HotelList.add(hotel);
		        
		    }
		    reader.close();
		} 
		catch(IOException ex){
		    System.out.println(ex.getMessage());
		}
		
	}
	
	/*public void HotelsData()
	{
		  Hotel Hotel1 = new Hotel("HOTEL MAHESH", "3star", "CHENNAI", 20.08, 1600);
		  Hotel Hotel2 = new Hotel("HOTEL KING", "4star", "CHENNAI", 20.08, 2300);
		  Hotel Hotel3 = new Hotel("HOTEL BLUE STAR", "5star", "HYDERABAD", 20.08, 3900);
		  Hotel Hotel4 = new Hotel("HOTEL SANKRANTI", "3star", "HYDERABAD", 20.08, 1500);
		  Hotel Hotel5 = new Hotel("HOTEL LEMON TREE", "4star", "HYDERABAD", 20.08, 1900);
		  Hotel Hotel6 = new Hotel("HOTEL DECCAN", "5star", "HYDERABAD", 20.08, 3200);
		  Hotel Hotel7 = new Hotel("HOTEL SAI", "3star", "BANGALORE", 20.08, 1400);
		  Hotel Hotel8 = new Hotel("HOTEL STAR", "4star", "BANGALORE", 20.08, 2100);
		  Hotel Hotel9 = new Hotel("HOTEL GRAND", "5star", "BANGALORE", 20.08, 3300);
		  
		  HotelList.add(Hotel1);
	      HotelList.add(Hotel2);
	      HotelList.add(Hotel3);
	      HotelList.add(Hotel4);
	      HotelList.add(Hotel5);
	      HotelList.add(Hotel6);
	      HotelList.add(Hotel7);
	      HotelList.add(Hotel8);
	      HotelList.add(Hotel9);
	      
	}*/
	public List<String> Hotelrating()
	{
    	ArrayList<String> hotelRatingList = new ArrayList<String>();
    	hotelRatingList.add("3star");
    	hotelRatingList.add("4star");
    	hotelRatingList.add("5star");
    	
    	return hotelRatingList;
	}
	public List<Hotel> findHotelByHotelCityAndRating(String hotelCity, String hotelRating)
	{
		List<Hotel> HotelAvailableOnCondition = new ArrayList<>();
		Hotel hotel;
		for (int i = 0; i < HotelList.size(); i++)
        {
			hotel = HotelList.get(i);
        	if(hotel.getCity().equals(hotelCity) && hotel.getHotelRating().equals(hotelRating) )
        	{
        		HotelAvailableOnCondition.add(hotel);
        	}
        }
		return HotelAvailableOnCondition;
	}
	
}