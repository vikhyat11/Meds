package com.example.medical.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bill")
public class Bill
{
	@Id
	private int bmid;
	private int mid;
	private String medicine;
	private int qty;
	private double total;
	private double subTotal;
	private int billNo;
	private String customerName;
	private String contact;
	public int getBmid() {
		return bmid;
	}
	public void setBmid(int bmid) {
		this.bmid = bmid;
	}
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
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
}
