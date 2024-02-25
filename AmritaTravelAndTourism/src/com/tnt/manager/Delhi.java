package com.tnt.manager;

import java.util.Scanner;

public class Delhi extends Selection {
	int sel;
	Scanner in = new Scanner(System.in);
	Delhi(){
		showSelection();
	}
	
	void meuseum() {
		System.out.println("Mueseums"+"\t\t"+"Working Hours"+"\t"+"Ticket Price");
		System.out.println("National mueseum"+"\t\t"+"10 am - 5 pm"+"\t"+"Rs 10/-");
		System.out.println("Rail mueseum    "+"\t\t"+"10 am - 5 pm"+"\t"+"Rs 20/-");
		System.out.println("Crafts mueseum  "+"\t\t"+"10 am - 5 pm"+"\t"+"Rs 20/-");
		sel = in.nextInt();
		switch(sel) {
		case 1: userSelection(10,"National mueseum"); break;
		case 2: userSelection(20,"Rail mueseum    "); break;
		case 3: userSelection(20,"Crafts mueseum  "); break;
		}
	}
	
	void artGallery() {
		System.out.println("Art Gallery"+"\t"+"Working Hours"+"\t"+"Ticket Price");
		System.out.println("Art Alive "+"\t"+"10 am - 4 pm"+"\t"+"Rs 30/-");
		System.out.println("Gandhi Smriti"+"\t"+"10 am - 5 pm"+"\t"+"Rs 30/-");
		sel = in.nextInt();
		switch(sel) {
		case 1: userSelection(30,"Art Live     "); break;
		case 2: userSelection(30,"Gandhi Smriti"); break;
		}
	}

	void amusementParks() {
		System.out.println("Amusement Parks"+"\t"+"Working Hours"+"\t"+"Ticket Price");
		System.out.println("Fun Max"+"\t"+"9 am - 5 pm"+"\t"+"Rs 200/-");
		System.out.println("Splash "+"\t"+"9 am - 6 pm"+"\t"+"Rs 300/-");
		System.out.println("VegaLand"+"\t"+"9 am - 5 pm"+"\t"+"Rs 300/-");
		sel = in.nextInt();
		switch(sel) {
		case 1: userSelection(200,"Fun Max"); break;
		case 2: userSelection(300,"Splash "); break;
		case 3: userSelection(300,"Vegaland"); break;
		}
	}

	void tournamnets() {
		System.out.println("Tournaments"+"\t\t"+"Game Played"+"\t"+"Ticket Price");
		System.out.println("ILeauge Delhi vs NEROCA"+"\t"+"19 Feb"+"\t"+"Rs 100/-");
		System.out.println("ILeauge Delhi vs Kerala"+"\t"+"23 Feb"+"\t"+"Rs 100/-");
		System.out.println("Booking depends on availability of tickets");
		sel = in.nextInt();
		switch(sel) {
		case 1: userSelection(100,"Delhi vs NEROCA"); break;
		case 2: userSelection(100,"Delhi vs Kerala"); break;
		}
	}
}
