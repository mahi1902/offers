package com.example.demo.controllers;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfferController {

	@GetMapping("/offer1")
	public List<DTO> testOffer1() {
		List<DTO> dtoList = new LinkedList<DTO>();
		dtoList.add(offer1(Arrays.asList(10, 20, 30, 40, 50, 60)));
		dtoList.add(offer1(Arrays.asList(10, 20, 30, 40, 50, 50, 60)));
		return dtoList;
	}

	@GetMapping("/offer2")
	public List<DTO> testOffer2() {
		List<DTO> dtoList = new LinkedList<DTO>();
		dtoList.add(offer2(Arrays.asList(10, 20, 30, 40, 40, 50, 60, 60)));
		dtoList.add(offer2(Arrays.asList(10, 20, 30, 40, 50, 50, 50, 60)));
		return dtoList;
	}
	
	@GetMapping("/offer3")
	public List<DTO> testOffer3() {
		List<DTO> dtoList = new LinkedList<DTO>();
		dtoList.add(offer2(Arrays.asList(10, 20, 30, 40, 40, 50, 60, 60)));
		dtoList.add(offer2(Arrays.asList(5, 5, 10, 20, 30, 40, 50, 50, 50, 60)));
		return dtoList;
	}

	private DTO offer1(List<Integer> priceList) {
		Collections.sort(priceList, Collections.reverseOrder());
		List<Integer> payableItems = new LinkedList<Integer>();
		List<Integer> discountedItems = new LinkedList<Integer>();
		for (int i = 0; i < priceList.size(); i++) {
			payableItems.add(priceList.get(i));
			if (i + 1 < priceList.size()) {
				discountedItems.add(priceList.get(i + 1));
			}
			i++;
		}
		return new DTO(priceList, payableItems, discountedItems);
	}

	private DTO offer2(List<Integer> priceList) {
		Collections.sort(priceList, Collections.reverseOrder());
		List<Integer> payableItems = new LinkedList<Integer>();
		List<Integer> discountedItems = new LinkedList<Integer>();
		for (int i = 0; i < priceList.size(); i++) {
			if (priceList.get(i) == priceList.get(i + 1)) {
				payableItems.add(priceList.get(i++));
				payableItems.add(priceList.get(i++));
				if (i + 1 < priceList.size()) {
					discountedItems.add(priceList.get(i++));
					discountedItems.add(priceList.get(i));
				}
			} else {
				payableItems.add(priceList.get(i++));
				discountedItems.add(priceList.get(i));
			}
		}
		return new DTO(priceList, payableItems, discountedItems);
	}
}