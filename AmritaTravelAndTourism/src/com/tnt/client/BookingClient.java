package com.tnt.client;
import java.io.IOException;
import java.util.Scanner;
import com.tnt.manager.BookingManager;


public class BookingClient {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//new BookingManager().vehicleBooking();
		new BookingManager().executeBooking();

	}

}
