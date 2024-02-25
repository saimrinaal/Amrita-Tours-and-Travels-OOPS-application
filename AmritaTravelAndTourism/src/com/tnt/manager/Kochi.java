package com.tnt.manager;

import java.util.Scanner;

public class Kochi extends Selection {
	int sel;
	Scanner in = new Scanner(System.in);
	Kochi(){
		showSelection();
	}
	
	void meuseum() {
		System.out.println("Mueseums"+"\t\t"+"Working Hours"+"\t"+"Ticket Price");
		System.out.println("Hill Palace "+"\t\t"+"10 am - 5 pm"+"\t"+"Rs 10/-");
		System.out.println("Folk Lore   "+"\t\t"+"10 am - 5 pm"+"\t"+"Rs 20/-");
		sel = in.nextInt();
		switch(sel) {
		case 1: userSelection(10,"Hill Palace"); break;
		case 2: userSelection(20,"Folk Lore  "); break;
		}
	}
	
	void artGallery() {
		System.out.println("Art Gallery"+"\t"+"Working Hours"+"\t"+"Ticket Price");
		System.out.println("Mellow     "+"\t"+"10 am - 4 pm"+"\t"+"Rs 30/-");
		System.out.println("Gallery OED"+"\t"+"10 am - 5 pm"+"\t"+"Rs 30/-");
		sel = in.nextInt();
		switch(sel) {
		case 1: userSelection(30,"Mellow     "); break;
		case 2: userSelection(30,"Gallery OED"); break;
		}
	}

	void amusementParks() {
		System.out.println("Amusement Parks"+"\t"+"Working Hours"+"\t"+"Ticket Price");
		System.out.println("WonderLa "+"\t"+"9 am - 5 pm"+"\t"+"Rs 200/-");
		System.out.println("Wave Pool"+"\t"+"9 am - 6 pm"+"\t"+"Rs 300/-");
		System.out.println("VegaLand"+"\t"+"9 am - 5 pm"+"\t"+"Rs 300/-");
		sel = in.nextInt();
		switch(sel) {
		case 1: userSelection(200,"WonderLa "); break;
		case 2: userSelection(300,"Wave Pool"); break;
		case 3: userSelection(300,"Vegaland "); break;
		}
	}

	void tournamnets() {
		System.out.println("Tournaments"+"\t\t"+"Game Played"+"\t"+"Ticket Price");
		System.out.println("ISL Kerala vs Chennai "+"\t"+"21 Feb"+"\t"+"Rs 200/-");
		System.out.println("ISl Kerala vs NEunited"+"\t"+"26 Feb"+"\t"+"Rs 200/-");
		System.out.println("Booking depends on availability of tickets");
		sel = in.nextInt();
		switch(sel) {
		case 1: userSelection(200,"Delhi vs NEROCA"); break;
		case 2: userSelection(200,"Delhi vs Kerala"); break;
		}
	}
}
