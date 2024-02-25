package com.tnt.manager;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PassengerHistory {
	
	void PassengerCheck(int sel) {
		switch(sel) {
		case 1000: passenger1(); break;
		case 1001: passenger2(); break;
		case 1002: passenger3(); break;
		default : System.out.println("Error occured");
		}
	}
	
	
	void passenger3() {
		File file = null;
		try{
			file = new File("/Users/sista.bhavani/Documents/SaiSem1/AmritaTravelAndTourism/src/resources/1002.txt");
			Scanner printOut= new Scanner(file);
			String printname = printOut.next();
			System.out.println("Passenger name "+printname);
			System.out.println("From \t To \t Date");
			System.out.println("-----------------------------");
			
			
			while(printOut.hasNextLine()) {
				for(int i=0;i<3;i++) {
					String printline = printOut.next();
					System.out.print(printline+"\t");				
				}
				System.out.println();
			}
			printOut.close();
		}catch(FileNotFoundException e) {
			System.out.println("Error Occured");
		}
		
	}

	void passenger2() {
		File file = null;
		try{
			file = new File("/Users/sista.bhavani/Documents/SaiSem1/AmritaTravelAndTourism/src/resources/1001.txt");
			Scanner printOut= new Scanner(file);
			String printname = printOut.next();
			System.out.println("Passenger name"+printname);
			System.out.println("From \t To \t Date");
			System.out.println("-----------------------------");
			
			
			while(printOut.hasNextLine()) {
				for(int i=0;i<3;i++) {
					String printline = printOut.next();
					System.out.print(printline+"\t");				
				}
				System.out.println();
			}
			printOut.close();
		}catch(FileNotFoundException e) {
			System.out.println("Error Occured");
		}
		
	}

	void passenger1() {
		File file = null;
		try{
			file = new File("/Users/sista.bhavani/Documents/SaiSem1/AmritaTravelAndTourism/src/resources/1000.txt");
			
			Scanner printOut= new Scanner(file);
			String printname = printOut.next();
			System.out.println("Passenger name "+printname);
			System.out.println("From \t To \t Date");
			System.out.println("-----------------------------");
			
			
			while(printOut.hasNextLine()) {
				for(int i=0;i<3;i++) {
					String printline = printOut.next();
					System.out.print(printline+"\t");				
				}
				System.out.println();
			}
			printOut.close();
		}catch(FileNotFoundException e) {
			System.out.println("Error Occured");
		}
		
	}

}