package com.comparator;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class Laptop implements Comparable<Laptop>{
	
	int rating;
	String Company;
	int cost;

	Laptop(String Company, int rating, int cost) {
		this.Company = Company;
		this.rating = rating;
		this.cost = cost;
	}

	public int getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "Laptop [rating=" + rating + ", Company=" + Company + ", cost=" + cost + "]";
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public int compareTo(Laptop l) {
		// TODO Auto-generated method stub
		if(this.getRating()<l.getRating())
			return 1;
		else
			return -1;
	}

	

}

class Sample {
	public static void main(String[] args) {
		ArrayList<Laptop> al = new ArrayList<Laptop>();
		al.add(new Laptop("Dell", 4, 4000));
		al.add(new Laptop("Hp", 5, 5000));
		al.add(new Laptop("MI", 3, 7000));
		
		Collections.sort(al);
		for( Laptop lap:al){
			System.out.println(lap);
		}

	}
}
