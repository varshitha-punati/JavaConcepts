package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableLaptop {
	
	int rating;
	String Company;
	int cost;

	ComparableLaptop(String Company, int rating, int cost) {
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

}
class Case1 implements Comparator<Laptop>{
	public static void main(String[] args) {
		ArrayList<Laptop> al = new ArrayList<Laptop>();
		al.add(new Laptop("Dell", 4, 4000));
		al.add(new Laptop("Hp", 5, 5000));
		al.add(new Laptop("MI", 3, 7000));
		
		Collections.sort(al,new Case1());
		for( Laptop lap:al){
			System.out.println(lap);
		}

	}

	
	@Override
	public int compare(Laptop o1, Laptop o2) {
		// TODO Auto-generated method stub
		if(o1.getRating()>o2.getRating())
			return -1;
		else
			return 1;
		
	}
}
class Case2 implements Comparator<Laptop>{
	public static void main(String[] args) {
		ArrayList<Laptop> al = new ArrayList<Laptop>();
		al.add(new Laptop("Dell", 4, 4000));
		al.add(new Laptop("Hp", 5, 5000));
		al.add(new Laptop("MI", 3, 7000));
		
		Collections.sort(al,new Case1());
		for( Laptop lap:al){
			System.out.println(lap);
		}

	}

	
	@Override
	public int compare(Laptop o1, Laptop o2) {
		// TODO Auto-generated method stub
		if(o1.getCost()>o2.getCost())
			return -1;
		else
			return 1;
		
	}
}
