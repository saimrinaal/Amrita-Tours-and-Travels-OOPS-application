package com.tnt.manager;

import java.util.Scanner;

public class Payment
{
    
    	public String getPayment()
    	{
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter the destination you chose");
       // String d = z.next();
        //double i = 0;
        System.out.println("Payment options:");
        System.out.println("1.	Debit Card");
        System.out.println("2.	Credit Card");
        System.out.println("3.	Net Banking");
        System.out.println("4.	Wallet");
        System.out.println("5.	Cash Pay on arrival");
        System.out.println("Select anyone from 1-5");

        int p = scan.nextInt();
        String modeOfPayment;
        switch(p)
        {
            case 1:
                System.out.println("Mode of payment: Debit Card");
                modeOfPayment = "Debit Card";
            break;
            case 2:
                System.out.println("Mode of payment: Credit Card");
                modeOfPayment = "Credit Card";
            break;
            case 3:
                System.out.println("Mode of payment: Net Banking");
                modeOfPayment = "Net Banking";
            break;
            case 4:
                System.out.println("Mode of payment: Wallet");
                modeOfPayment = "Wallet";
            break;
            case 5:
                System.out.println("Mode of payment: Cash Pay on arrival");
                modeOfPayment = "Cash Pay on arrival";
            break;
            default :
                System.out.println("Error");
                modeOfPayment = "Error";
        }
        return modeOfPayment;

       /* switch(d)
        {
        case "Mysore":
                i = 477.0;
            break;
        case "Panaji":
                i = 909.4;
            break;
        case "Chennai":
                i = 717.3;
            break;
        case "Kochi":
                i = 138.2;
            break;
        case "Kolkata":
                i = 2389.6;
            break;
        case "Delhi":
                i = 2852.4;
            break;
        default :
            System.out.println("Destination not available");
        }

        System.out.println("Choose mode of Transport");
        System.out.println("1. Bus");
        System.out.println("2. Train");
        System.out.println("3. Flight");

        int q = z.nextInt(); z.close();
        switch(q)
        {
            case 1:
                System.out.println("Price is :" +(i*2000));
            break;
            case 2:
                System.out.println("Price is :" +(i*300));
            break;
            case 3:
                System.out.println("Price is :" +(i*3000));
            default:
                System.out.println("Error");

        }
        */
    }
}
