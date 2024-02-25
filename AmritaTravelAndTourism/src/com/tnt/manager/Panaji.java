package com.tnt.manager;

import java.util.Scanner;


public class Panaji extends Selection {
	int sel;
	Scanner in = new Scanner(System.in);
	Panaji(){
		showSelection();
	}
	
	void meuseum() {
		System.out.println("Mueseums"+"\t\t"+"Working Hours"+"\t"+"Ticket Price");
		System.out.println("State mueseum"+"\t\t"+"10 am - 5 pm"+"\t"+"Rs 10/-");
		System.out.println("Central mueseum"+"\t\t"+"10 am - 5 pm"+"\t"+"Rs 20/-");
		sel = in.nextInt();
		switch(sel) {
		case 1: userSelection(10,"State mueseum"); break;
		case 2: userSelection(20,"Central mueseum"); break;
		}
	}
	
	void artGallery() {
		System.out.println("Art Gallery"+"\t"+"Working Hours"+"\t"+"Ticket Price");
		System.out.println("Gitanjali"+"\t"+"10 am - 4 pm"+"\t"+"Rs 30/-");
		System.out.println("Sunaparanta"+"\t"+"10 am - 5 pm"+"\t"+"Rs 30/-");
		sel = in.nextInt();
		switch(sel) {
		case 1: userSelection(30,"Gitanjali"); break;
		case 2: userSelection(30,"Sunaparanta"); break;
		}
	}

	void amusementParks() {
		System.out.println("Amusement Parks"+"\t"+"Working Hours"+"\t"+"Ticket Price");
		System.out.println("Casino Pride"+"\t"+"9 am - 5 pm"+"\t"+"Rs 100/-");
		System.out.println("Blue Whale"+"\t"+"9 am - 6 pm"+"\t"+"Rs 200/-");
		System.out.println("Splash down"+"\t"+"9 am - 5 pm"+"\t"+"Rs 200/-");
		sel = in.nextInt();
		switch(sel) {
		case 1: userSelection(100,"Casino Pride"); break;
		case 2: userSelection(200,"Blue whale"); break;
		case 3: userSelection(200,"Splash down"); break;
		}
	}

	void tournamnets() {
		System.out.println("Tournaments"+"\t"+"Game Played"+"\t"+"Ticket Price");
		System.out.println("ISL Goa vs Bengaluru"+"\t"+"21 Feb"+"\t"+"Rs 100/-");
		System.out.println("ISL Goa vs Hyderbad"+"\t"+"28 Feb"+"\t"+"Rs 100/-");
		System.out.println("Booking dependa on availability if tickets");
		sel = in.nextInt();
		switch(sel) {
		case 1: userSelection(100,"Goa vs Bengaluru"); break;
		case 2: userSelection(200,"Goa vs Hyderbad"); break;
		}
	}
}
