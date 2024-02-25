package com.tnt.manager;
import java.util.ArrayList;
import java.util.Scanner;

public class Selection {
	
	int total=0,count;
	
	Scanner in = new Scanner (System.in);
	
	ArrayList<String> userSel = new ArrayList<String>();
	
	void showSelection() {
		System.out.println("Which one would you like to select");
		System.out.println("1 Mueseum");
		System.out.println("2 Art Gallery");
		System.out.println("3 Amusement Parks");
		System.out.println("4 Tournaments");
		int sel= in.nextInt();
		userSelect(sel);
	}
	
	void userSelect(int i) {
		switch(i) {
		case 1:meuseum(); break;
		case 2:artGallery(); break;   
		case 3:amusementParks(); break;
		case 4:tournamnets(); break;
		default: System.out.println("Invalid Selection");
		}
	}
	
	void userSelection(int price, String name) {
		System.out.println("No: of tickets to be booked ");
		count = in.nextInt();
		total = total+(price*count);
		
		userSel.add(name);
		userSel.add(Integer.toString(price));
		userSel.add(Integer.toString(count));
		
		System.out.println("Do you want to continue");
		String s = in.next();
		if(s.equals("yes")||s.equals("y"))
			showSelection();
		else
			printSummary();
	}

	void artGallery() {
		// TODO Auto-generated method stub
		
	}

	void amusementParks() {
		// TODO Auto-generated method stub
		
	}

	void tournamnets() {
		// TODO Auto-generated method stub
		
	}

	void meuseum() {
		// TODO Auto-generated method stub
		
	}
	
	void printSummary() {
		System.out.println("Selected List"+"\t\t"+"Ticket Price"+"\t"+"No of tickets");
		System.out.println("--------------------------------------------------------");
		for(int i=0;i<userSel.size();i=i+3) {
			System.out.println(userSel.get(i)+"\t\t"+userSel.get(i+1)+"\t\t"+userSel.get(i+2));
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("\t\t\t"+"Total"+"\t\t"+total);
	}

}