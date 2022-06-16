package com.personal.upskill.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEx23_Collectors_PartitioningBy {

	public static void main(String[] args) {
		List<Product> productInCart = Arrays.asList(new Product("P1",80.00),new Product("P2",180.00),new Product("P3",280.00));
		Map<Boolean,List<Product>> productMap = productInCart.stream().collect(Collectors.partitioningBy(p->p.getProductCost()<100));
		productMap.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
	}
}
