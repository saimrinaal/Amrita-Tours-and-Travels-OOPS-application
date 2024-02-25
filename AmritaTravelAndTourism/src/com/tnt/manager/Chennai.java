package com.tnt.manager;

import java.util.Scanner;

public class Chennai extends Selection {
	int sel;
	Scanner in = new Scanner(System.in);
	Chennai(){
		showSelection();
	}
	
	void meuseum() {
		System.out.println("Mueseums"+"\t\t"+"Working Hours"+"\t"+"Ticket Price");
		System.out.println("Dakshina chita"+"\t\t"+"10 am - 5 pm"+"\t"+"Rs 10/-");
		System.out.println("Vivekananda   "+"\t\t"+"10 am - 5 pm"+"\t"+"Rs 20/-");
		sel = in.nextInt();
		switch(sel) {
		case 1: userSelection(10,"Dakshina chita"); break;
		case 2: userSelection(20,"Vivekananda   "); break;
		}
	}
	
	void artGallery() {
		System.out.println("Art Gallery"+"\t"+"Working Hours"+"\t"+"Ticket Price");
		System.out.println("Art Alive  "+"\t"+"10 am - 4 pm"+"\t"+"Rs 30/-");
		System.out.println("Gandhi Smriti"+"\t"+"10 am - 5 pm"+"\t"+"Rs 30/-");
		sel = in.nextInt();
		switch(sel) {
		case 1: userSelection(30,"Art Live     "); break;
		case 2: userSelection(30,"Gandhi Smriti"); break;
		}
	}

	void amusementParks() {
		System.out.println("Amusement Parks"+"\t"+"Working Hours"+"\t"+"Ticket Price");
		System.out.println("Prime time  "+"\t"+"9 am - 5 pm"+"\t"+"Rs 200/-");
		System.out.println("Snow Kingdom"+"\t"+"9 am - 6 pm"+"\t"+"Rs 300/-");
		sel = in.nextInt();
		switch(sel) {
		case 1: userSelection(200,"Prime time  "); break;
		case 2: userSelection(300,"Snow kingdom"); break;
		}
	}

	void tournamnets() {
		System.out.println("Tournaments"+"\t\t"+"Game Played"+"\t"+"Ticket Price");
		System.out.println("ISL Chennai vs NEUnited"+"\t"+"18 Feb"+"\t"+"Rs 100/-");
		System.out.println("ISL Chennai vs Kerala  "+"\t"+"21 Feb"+"\t"+"Rs 100/-");
		System.out.println("Booking depends on availability of tickets");
		sel = in.nextInt();
		switch(sel) {
		case 1: userSelection(100,"Chennai vs NEUnited"); break;
		case 2: userSelection(100,"Delhi vs Kerala    "); break;
		}
	}
}
