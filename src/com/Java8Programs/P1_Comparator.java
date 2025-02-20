package com.Java8Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product
{
	int id;
	String name;
	float price;
	
	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class P1_Comparator {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "Shirt",2000f));
		list.add(new Product(2, "Dress",3000f));
		list.add(new Product(3,"Glasses",1000f));
		System.out.println("Sorting below on basis of name");
		Collections.sort(list,(p1,p2)->{
		return p1.name.compareTo(p2.name);
		});
		for(Product p : list)
		{
			System.out.println("ID : "+p.id);
			System.out.println("Name : "+p.name);
		}
	}
}
