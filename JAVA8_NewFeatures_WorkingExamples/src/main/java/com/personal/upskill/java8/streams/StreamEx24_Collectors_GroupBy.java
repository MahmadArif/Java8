package com.personal.upskill.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEx24_Collectors_GroupBy {
	public static void main(String[] args) {
		List<Dish> dishLst = Arrays.asList(new Dish("D1","VEG"),new Dish("D2","VEG"),new Dish("D3","VEG"),new Dish("D4","VEG"),
				                           new Dish("D5","NON-VEG"),new Dish("D6","NON-VEG"),new Dish("D7","NON-VEG"));
		Map<String,List<Dish>> mapDishes =  dishLst.stream().collect(Collectors.groupingBy(Dish::getDishType));
		mapDishes.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
	}
}


class Dish{
	String dishName;
	String dishType;
	
	
	public Dish(String dishName, String dishType) {
		super();
		this.dishName = dishName;
		this.dishType = dishType;
	}
	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public String getDishType() {
		return dishType;
	}
	public void setDishType(String dishType) {
		this.dishType = dishType;
	}
	@Override
	public String toString() {
		return "DishName [dishName=" + dishName + ", dishType=" + dishType + "]";
	}

	

}