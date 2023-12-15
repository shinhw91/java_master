package com.yedam;

import lombok.Data;

@Data
public class Product {
	// 필드(속성)
	private String productCode;
	private String productName;
	private int productPrice;
	private String productEnterDate;
	private int productCount;
	
	// 생성자
	public Product() {
		
	}
	
	public Product(String productCode, String productName, int productPrice, String productEnterDate, int productCount) {
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productEnterDate = productEnterDate;
		this.productCount = productCount;
	}
	
	// 메소드
	void showInfo() {
		System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", productCode, productName, productPrice, productEnterDate, productCount);
	}
	

}
