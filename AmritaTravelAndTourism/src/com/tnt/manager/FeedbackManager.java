package com.tnt.manager;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import com.tnt.model.Feedback;
public class FeedbackManager {
	Scanner scan = new Scanner(System.in);
	public void acceptFeedback(String customerName){
	
		String feedbackComments = scan.nextLine();
		String rating = scan.nextLine();	
		String improvement = scan.nextLine();
		
		
		Feedback feedback = new Feedback();
		feedback.setFeedbackComments(feedbackComments);
		feedback.setRating(rating);
		feedback.setImprovement(improvement);
		feedback.setCustomer(customerName);
		feedback.setFeedbackDate(new Date());
		
		
		System.out.println("FeedBack.....");
		System.out.println("-------------");
		System.out.println("Customer Name :" + feedback.getCustomer());
		System.out.println("Date : " + feedback.getFeedbackDate());
		
		 try {
			 File file = new File(".");
	         BufferedWriter out = new BufferedWriter(new FileWriter(new File(".").getAbsoluteFile() + "/src/resources/"+"feedback.txt"));
	         out.write(feedback.getCustomer()+","+feedback.getFeedbackComments()+","+feedback.getRating()+","+feedback.getImprovement());
	         out.close();
	         System.out.println("File created successfully");
	      }
	      catch (IOException e) {
	      }
	}	
}
