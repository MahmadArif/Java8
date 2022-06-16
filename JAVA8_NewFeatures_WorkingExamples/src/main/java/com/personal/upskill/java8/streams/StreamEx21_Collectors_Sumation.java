package com.personal.upskill.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx21_Collectors_Sumation {
	
	public static void main(String[] args) {
		List<Product> productInCart = Arrays.asList(new Product("P1",80.00),new Product("P2",180.00),new Product("P3",280.00));
		Double moneytoPay = productInCart.stream().collect(Collectors.summingDouble(Product::getProductCost));
		System.out.println("Money to be paid ="+moneytoPay);
	}

}

class Product{
	private String productName;
	private Double productCost;
	

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, Double productCost) {
		super();
		this.productName = productName;
		this.productCost = productCost;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductCost() {
		return productCost;
	}
	public void setProductCost(Double productCost) {
		this.productCost = productCost;
	}
	
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productCost=" + productCost + "]";
	}
	
}