package com.example.medical.serice;

import org.springframework.stereotype.Service;

import com.example.medical.dto.Bill;

@Service
public interface IntBillService {

	public Bill generateBill(Bill bill);
	public  Bill editBill(Bill bill);
}
