package com.tnt.manager;

import java.util.Scanner;

public class TravelAndTourism 
{
     public static void main(String[] args)
     {
     		new TravelAndTourism().getDestinationCity();
     }
     public String getDestinationCity(){
    	 String dest;
    	 Scanner in = new Scanner(System.in);
    	 System.out.println("Enter a tourist destination (IN CAPITALS) : ");
    	 dest = in.nextLine();
    	 
    	 Destination d = new Destination();
    	// in.close();
    	 
    	 switch(dest)
    	 {
    	 case "MYSORE":
    		 d.Mysore();
    		 break;
    	 case "PANAJI":
    		 d.Panaji();
    		 break;
    	 case "CHENNAI":
    		 d.Chennai();
    		 break;
    	 case "KOCHI":
    		 d.Kochi();
    		 break;
    	 case "KOLKATA":
    		 d.Kolkata();
    		 break;
    	 case "DELHI":
    		 d.Delhi();
    		 break;
    	 default :
    		 System.out.println("Destination is not available");
    	 }
    	 return dest;
     }
}
class Destination
{
	void Mysore()
	{
		System.out.println("Your destination is Mysore");
	}
	
	void Panaji()
	{
		System.out.println("Your destination is Panaji(Goa)");
	}
	
	void Chennai()
	{
		System.out.println("Your destination is Chennai");
	}
	
	void Kochi()
	{
		System.out.println("Your destination is Kochi");
	}
	
	void Kolkata()
	{
		System.out.println("Your destination is Kolkata");
	}
	
	void Delhi()
	{
		System.out.println("Your destination is Delhi");
	}
}
	