package com.tnt.manager;
import java.util.List;
import java.util.Scanner;

import com.tnt.db.HotelDAO;
import com.tnt.model.BookingModel;
import com.tnt.model.Hotel;

/**
 * 
 * 
 * @author sista.bhavani
 *
 */
public class HotelManager extends Manager{
	
	Scanner scan = new Scanner(System.in);
	HotelDAO hotelDao = new HotelDAO();
	
	@Override
	/**
	 * 
	 */
	public BookingModel performStage(BookingModel booking) {
		Hotel hotel = chooseHotel(booking.getDestinationCity());
		booking.setHotel(hotel);
		return booking;
	}
	
	/**
	 * 
	 * 
	 * @param selectedCity
	 * @return hotel
	 */
	public Hotel chooseHotel(String selectedCity)
	{	
		List<String> hotelRatingList = hotelDao.Hotelrating();
		for (int i = 0; i<hotelRatingList.size(); i++)
    	{
    		System.out.println((i+1)+"."+hotelRatingList.get(i));
    	}
		System.out.println("please choose rating");
		int selectedOptionRating = scan.nextInt();
		String selectedRating = hotelRatingList.get(selectedOptionRating-1);
		
		List<Hotel> hotelList = hotelDao.findHotelByHotelCityAndRating(selectedCity, selectedRating);
		if(hotelList.size()==0){
			System.out.println("sorry, hotels are not available");
			return null;
		}
		for(int i=0; i<hotelList.size(); i++)
		{
			Hotel hotel = hotelList.get(i);
			System.out.println((i+1)+"."+ hotel.getHotelName() + "-"+"-"+ hotel.getCostPerDay());
		}
		System.out.println("please choose a hotel");
		int selectedHotel = scan.nextInt();
		return hotelList.get(selectedHotel-1);
		
	}
}
