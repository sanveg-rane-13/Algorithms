package com.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 
 * @author Sanveg
 *
 */

/*
 * Uses recursion to find all permutations of a string. 
 * Number of permutations = (length)! / (each repetition!)
 */

public class StringPermutations {

	public char[] resultList;
	
	public int resultCount = 0;

	public void permuteString(String input) {
	
		Map<Character, Integer> countMap = new TreeMap<>();
		
		List<Character> charSet = new ArrayList<>();
		
		List<Integer> charCount = new ArrayList<>();
		
		this.resultList = new char[input.length()];

		for (char c : input.toCharArray()) {
			if (countMap.get(c) != null) {
				int count = countMap.get(c);
				countMap.put(c, ++count);
			} else {
				countMap.put(c, 1);
			}
		}

		int i = 0;
		for (Character c : countMap.keySet()) {
			charSet.add(i, c);
			charCount.add(i, countMap.get(c));
			i++;
		}
		int startLevel = 0;
		calculateResult(charSet, charCount, startLevel);
	}

	/*
	 * Iterates over the string and inserts the new element whoes count is zero into the result array
	 */
	public void calculateResult(List<Character> charSet, List<Integer> charCount, int level) {
		if (level == this.resultList.length) {
			printResult();
			return;
		}
		for (int i = 0; i < charSet.size(); i++) {

			if (charCount.get(i) > 0) {

				this.resultList[level] = charSet.get(i);

				int count = charCount.get(i);

				charCount.set(i, --count);

				calculateResult(charSet, charCount, level + 1);

				charCount.set(i, ++count);

			}
		}
	}

	public void printResult() {
		this.resultCount++;
		
		System.out.print(resultCount + " -> ");
		
		for (int i = 0; i < resultList.length; i++) {
		
			System.out.print(resultList[i]);
			
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		
		String input = sc.nextLine();
		
		sc.close();

		StringPermutations sp = new StringPermutations();
		
		sp.permuteString(input);
	}
}
