package com.Java8Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Mobile
{
	int id;
	String name;
	float price;
	
	public Mobile(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class P2_FilterCollectionData {
	public static void main(String[] args) {
		List<Mobile> list = new ArrayList<>();
		list.add(new Mobile(1,"Apple",150000f));
		list.add(new Mobile(2,"Samsung",100000f));
		list.add(new Mobile(3,"Xiaomi",13000f));
		list.add(new Mobile(4,"One Plus", 40000f));
		Stream<Mobile> filteredData = list.stream().filter(p->p.price>20000);
		filteredData.forEach(
			p-> System.out.println(p.name+" : "+p.price));
	}
}