package com.amstech.bikerent.dto;

public class PaymentDTO {
	private int id;

	private int booking_id;
	private String payment_mode;
	private String payment_status;
	private String txn_id;
	private String payment_date_time;
	private int advance_amount;
	private int remaining_amount;
	private int extra_charges;
	private int total_amount;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public String getPayment_mode() {
		return payment_mode;
	}
	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}
	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	public String getTxn_id() {
		return txn_id;
	}
	public void setTxn_id(String txn_id) {
		this.txn_id = txn_id;
	}
	public String getPayment_date_time() {
		return payment_date_time;
	}
	public void setPayment_date_time(String payment_date_time) {
		this.payment_date_time = payment_date_time;
	}
	public int getAdvance_amount() {
		return advance_amount;
	}
	public void setAdvance_amount(int advance_amount) {
		this.advance_amount = advance_amount;
	}
	public int getRemaining_amount() {
		return remaining_amount;
	}
	public void setRemaining_amount(int remaining_amount) {
		this.remaining_amount = remaining_amount;
	}
	public int getExtra_charges() {
		return extra_charges;
	}
	public void setExtra_charges(int extra_charges) {
		this.extra_charges = extra_charges;
	}
	public int getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}


}
