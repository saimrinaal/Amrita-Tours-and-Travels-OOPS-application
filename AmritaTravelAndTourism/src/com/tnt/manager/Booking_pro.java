package com.tnt.manager;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Booking_pro {
	
    private static boolean Mainmenu = true;
    private static boolean Submenu = true;

	//public static void main(String[] args) throws IOException {
		//new Booking_pro().reserveHotelRoom();
	//}
	public void reserveHotelRoom(){
		Scanner in = new Scanner(System.in);
		
		String[]Hotel = new String[10];
		int roomNum = 0;
		Atfirst(Hotel);
		
		String[]Details = new String[10];
		Initial(Details);
		
		
		//while(Mainmenu)
		{
			while(Submenu) {
				System.out.println("Hey there,Welcome to our world\n Its time to make make your trip a memorable one");
				System.out.println("How can we help u");
				System.out.println("________________________________________________________________");
				System.out.println("A : Book a Room : ");
				System.out.println("________________________________________________________________");
				System.out.println("C : Check the rooms available : ");
				System.out.println("________________________________________________________________");
				System.out.println("V : Vacating option  : ");
				System.out.println("________________________________________________________________");
				System.out.println("D : Details of the room : ");
				System.out.println("________________________________________________________________");
				System.out.println("S : Save the Data into file ");
				System.out.println("________________________________________________________________");
				
				String Select = in.next();
				Select = Select.toUpperCase();
				switch (Select) {
				
				case "A" :
                BookARoom(Hotel,roomNum);
                break;
                
				case "C" :
				CheckTheRoom(Hotel);
				break;
				
				case "V" :
				VacatingOption(Hotel,roomNum);
				break;
				
				case "D" :
				DetailsOfRooms(Hotel);
				break;
				
				case "S":
				//SaveData(Hotel);
				
				default :
				System.out.println("Please Enter a Valid Option ");	
				break;
				}
			
				try {
				System.out.println("Would you like to check other options ?\n1=Yes\n2=No");
				if(in.nextInt()==1)
				{
					Submenu=true;
				}
				else {
					Submenu=false;
				}
				}catch (Exception e) {
					System.out.println("Please Give a Valid Option ");
				}
			}
				
			}
			try {
			Submenu = true;
			System.out.println("Would you like to continue on our page :\n 1=Yes\n2=No  ");
			if(in.nextInt()==1)
			{
				Mainmenu=true;
			}
			else {
				return;
			}
			
			}catch (Exception e) {
				System.out.println("Please Give a Valid Option ");
			}
	} 
		
			
		
			
		
	private static void SaveData(String[] Hotel) throws IOException {
		try (PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\viswa\\OneDrive\\Desktop\\HARI"))) 
        {
            int x;
            for (x = 0; x <Hotel.length; x++) {
             out.println(Hotel[x]+" is staying in room number " + (x+1));
            }

        }
        System.out.println("All Room Names have been Saved.");
		
	}





	private static void BookARoom(String[] Hotel, int roomNum) {
		Scanner in = new Scanner(System.in);
		System.out.println("Do you prefer\n 1. Ac\n 2.Non-Ac ");
		
		if (in.nextInt()==1 ) {
			System.out.println("Choose room 1-5 : ");
			int Rnum = in.nextInt()-1;
			if (Hotel[Rnum]=="Nobody") {
				System.out.println("Enter your name : ");
				Hotel[Rnum]=in.next();	
			}
			else {
				System.out.println("Sorry the room is occupied :-( ");
			}
		}
		else {
	    System.out.println("Choose room 6-10 : ");
		int Rnum = in.nextInt()-1;
		if (Hotel[Rnum]=="Nobody") {
			System.out.println("Enter your name : ");
			Hotel[Rnum]=in.next();	
		}
		else {
			System.out.println("Sorry the room is occupied :-( ");
		}
			
		}
	}


	private static void CheckTheRoom(String[] Hotel) {
		for(int i = 0;i<10;i++)
		{
			System.out.println("The room is occupied by " + Hotel[i] );
		}
		
		
	}


	private static void VacatingOption(String[] Hotel, int roomNum) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("For vacating ,Please enter your room number : ");
		int h = in.nextInt();
		if (Hotel[h]=="Nobody")
		{ System.out.println(" The room is already empty");
		}
		else 
			Hotel[h]="Nobody";
		}
		
		
		
	


	private static void DetailsOfRooms(String[] Hotel)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("press 1 for Ac room\n press 2 for non Ac ");
		int y = in.nextInt();
		if(y ==1)
		{
			System.out.println("ROOM 1-5 has\n Double bed\n Free 4 Star Roomservices\n Free food(limited)\n Free wifi with 100mbps ******");
		}
		else
		{
			System.out.println("ROOM 6-10 has\n Single bed ,\n Afordable Pay for roomservices\n Payed food (unlimited)\n Free wifi with 40 mbps *");
		}
			
		}
		
		//System.out.println("");
		
		
	


	private static void Initial(String[] Details) {
		for (int i = 0;i<5;i++)
		 {
			Details[i]="With_AC";
		 }
		
	}


	private static void Atfirst(String[]Hotel)
	{
	 for (int i = 0;i<Hotel.length;i++)
	 {
		Hotel[i]="Nobody";
	 }
		
	}

}

