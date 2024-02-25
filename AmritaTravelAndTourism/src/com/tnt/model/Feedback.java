package com.tnt.model;

import java.util.Date;

public class Feedback {
	private String feedbackComments;
	private String rating;
	private String improvement;
	private String customer;
	private Date feedbackDate;
	public Feedback(){
		
	}
	
	public Feedback(String feedback, String rating, String improvement,String customer, Date feedbackDate)
	{
		this.feedbackComments=feedback;
		this.rating=rating;
		this.improvement=improvement;
	}

	public String getFeedbackComments() {
		return feedbackComments;
	}

	public void setFeedbackComments(String feedbackComments) {
		this.feedbackComments = feedbackComments;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getImprovement() {
		return improvement;
	}

	public void setImprovement(String improvement) {
		this.improvement = improvement;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Date getFeedbackDate() {
		return feedbackDate;
	}

	public void setFeedbackDate(Date feedbackDate) {
		this.feedbackDate = feedbackDate;
	}

}
