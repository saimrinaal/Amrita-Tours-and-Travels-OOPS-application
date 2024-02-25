package com.tnt.manager;

import java.util.Scanner;

public class Kolkata extends Selection {
	int sel;
	Scanner in = new Scanner(System.in);
	Kolkata(){
		showSelection();
	}
	
	void meuseum() {
		System.out.println("Mueseums"+"\t\t"+"Working Hours"+"\t"+"Ticket Price");
		System.out.println("Indian mueseum"+"\t\t"+"10 am - 5 pm"+"\t"+"Rs 10/-");
		System.out.println("Nehru mueseum   "+"\t\t"+"10 am - 5 pm"+"\t"+"Rs 20/-");
		System.out.println("Kolkata mueseum "+"\t\t"+"10 am - 5 pm"+"\t"+"Rs 20/-");
		sel = in.nextInt();
		switch(sel) {
		case 1: userSelection(10,"Indian mueseum"); break;
		case 2: userSelection(20,"Nehru mueseum "); break;
		case 3: userSelection(20,"Kolkata mueseum"); break;
		}
	}
	
	void artGallery() {
		System.out.println("Art Gallery"+"\t"+"Working Hours"+"\t"+"Ticket Price");
		System.out.println("Emamy    "+"\t"+"10 am - 4 pm"+"\t"+"Rs 30/-");
		sel = in.nextInt();
		switch(sel) {
		case 1: userSelection(30,"Emamy   "); break;
		}
	}

	void amusementParks() {
		System.out.println("Amusement Parks"+"\t"+"Working Hours"+"\t"+"Ticket Price");
		System.out.println("Nicco  "+"\t"+"9 am - 5 pm"+"\t"+"Rs 200/-");
		System.out.println("Aquatica"+"\t"+"9 am - 6 pm"+"\t"+"Rs 300/-");
		sel = in.nextInt();
		switch(sel) {
		case 1: userSelection(200,"Nicco  "); break;
		case 2: userSelection(300,"Aquatica"); break;
		}
	}

	void tournamnets() {
		System.out.println("Tournaments"+"\t\t"+"Game Played"+"\t"+"Ticket Price");
		System.out.println("ISL East Bengal vs NEUnited"+"\t"+"23 Feb"+"\t"+"Rs 100/-");
		System.out.println("ISL East Bengal vs Odisha  "+"\t"+"27 Feb"+"\t"+"Rs 100/-");
		System.out.println("Booking depends on availability of tickets");
		sel = in.nextInt();
		switch(sel) {
		case 1: userSelection(100,"East Bengal vs NEUnited"); break;
		case 2: userSelection(100,"East Bengal vs Odisha  "); break;
		}
	}
}
