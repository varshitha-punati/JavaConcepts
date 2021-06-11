package com.collectionframework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class AboutCollectionInterface {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		List <Integer> al = new ArrayList<> ();

		List <Integer> ll = new LinkedList<> ();

		List <Integer> v = new Vector<> ();
		
		Set<Integer> hs = new HashSet<> ();

		Set<Integer> lhs = new LinkedHashSet<> ();

		Set<Integer> ts = new TreeSet<> ();
		
		Queue <Integer> pq = new PriorityQueue<> ();

		Queue <Integer> ad = new ArrayDeque<> ();
		
		Deque<Object> ad1 = new ArrayDeque<> ();
	}

}
