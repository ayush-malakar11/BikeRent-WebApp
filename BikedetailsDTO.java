package com.amstech.bikerent.dto;

public class BikedetailsDTO {
	private int id;
	private String bike_model_name;
	private String bike_registration_number;
	private int cityId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBike_model_name() {
		return bike_model_name;
	}
	public void setBike_model_name(String bike_model_name) {
		this.bike_model_name = bike_model_name;
	}
	public String getBike_registration_number() {
		return bike_registration_number;
	}
	public void setBike_registration_number(String bike_registration_number) {
		this.bike_registration_number = bike_registration_number;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	
	
}
