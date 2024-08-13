package com.amstech.bikerent.dto;

public class BookingDTO {
	private int id;

	private int bike_details_id;
	private int customer_id;
	private String booking_date_time;
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBike_details_id() {
		return bike_details_id;
	}

	public void setBike_details_id(int bike_details_id) {
		this.bike_details_id = bike_details_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getBooking_date_time() {
		return booking_date_time;
	}

	public void setBooking_date_time(String booking_date_time) {
		this.booking_date_time = booking_date_time;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
