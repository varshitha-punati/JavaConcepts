package com.techwave;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
	

	public void solution(String S) {
		Map<Character, Long> collect = S.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		Optional<Character> firstNonRepeat = collect.entrySet().stream().filter((e) -> e.getValue() == 1)
				.map(e -> e.getKey()).findFirst();
		if (firstNonRepeat.isPresent()) {
			System.out.println("Output:"+firstNonRepeat.get());
		}
		else {
			System.out.println("Output:"+"NA");
		}

//		return S;
	}

	public static void main(String[] args) {
	
		String S= "character";
		Solution s1 = new Solution();
		s1.solution(S);
	}
}
