package com.techwave;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SolutionOnStrings {
	public String Solution(String S) {
		
		char y[] = S.toCharArray();
		int size = y.length;
		
		Map<Character, Integer> map = new HashMap<>();
		int i = 0;
		while (i != size) {
			if (map.containsKey(y[i]) == false) {
				map.put(y[i], i);
			} else {
				int oldval = map.get(y[i]);
				int newval = oldval + 1;
				map.put(y[i], newval);
			}
			++i;
		}
		
		Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
		for (Map.Entry<Character, Integer> data : hmap) {
			if (data.getValue() == 1) {
				System.out.println(data.getKey());
			}
		}
		return S;
	}

	public static void main(String[] args) {
		String S = "TechWave";
		SolutionOnStrings output = new SolutionOnStrings();
		output.Solution(S);

	}
	
}
