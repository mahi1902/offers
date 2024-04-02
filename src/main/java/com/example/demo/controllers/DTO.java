package com.example.demo.controllers;

import java.util.LinkedList;
import java.util.List;

public class DTO {
	List<Integer> priceList = new LinkedList<Integer>();
	List<Integer> payableItems = new LinkedList<Integer>();
	List<Integer> discountedItems = new LinkedList<Integer>();

	public List<Integer> getPriceList() {
		return priceList;
	}

	public void setPriceList(List<Integer> priceList) {
		this.priceList = priceList;
	}

	public List<Integer> getPayableItems() {
		return payableItems;
	}

	public void setPayableItems(List<Integer> payableItems) {
		this.payableItems = payableItems;
	}

	public List<Integer> getDiscountedItems() {
		return discountedItems;
	}

	public void setDiscountedItems(List<Integer> discountedItems) {
		this.discountedItems = discountedItems;
	}

	public DTO(List<Integer> priceList, List<Integer> payableItems, List<Integer> discountedItems) {
		super();
		this.priceList = priceList;
		this.payableItems = payableItems;
		this.discountedItems = discountedItems;
	}
	
	

}
