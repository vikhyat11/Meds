package com.example.medical.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Stock")
public class Stock
{
	@Id
	private int mid;
	private String medicine;
	private LocalDate mfgDate;
	private LocalDate expDate;
	private int qty;
	private String company;
	private double price;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	public LocalDate getMfgDate() {
		return mfgDate;
	}
	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}
	public LocalDate getExpDate() {
		return expDate;
	}
	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
