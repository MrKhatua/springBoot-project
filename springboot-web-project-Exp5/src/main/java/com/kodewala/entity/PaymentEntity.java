package com.kodewala.entity;


public class PaymentEntity {
	private double amount;
	private String description;
	private String bankName;
	private String paymentType;
	public PaymentEntity() {

	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	@Override
	public String toString() {
		return "PaymentEntity [amount=" + amount + ", description=" + description + ", bankName=" + bankName
				+ ", paymentType=" + paymentType + "]";
	}
	
	
	
}
