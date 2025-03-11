package com.Java8Programs;

import java.util.Arrays;
import java.util.List;

public class P4_StringFunctions {
	
	public static void main(String[] args) {
		// Example list of strings
		List<String> stringList = Arrays.asList("Hello", "Java", "Programming", "Language", "String");
		
		// 1. Display the list of strings
		System.out.println("1. List of strings: " + stringList);
		
		// 2. Convert each string to uppercase
		System.out.println("2. Strings in uppercase:");
		stringList.stream()
				.map(String::toUpperCase)
				.forEach(System.out::println);
		
		// 3. Find the length of each string
		System.out.println("3. Length of each string:");
		stringList.stream()
				.map(str -> str + " (Length: " + str.length() + ")")
				.forEach(System.out::println);
		
		// 4. Check if each string contains the letter 'a'
		System.out.println("4. Strings containing 'a':");
		stringList.stream()
				.filter(str -> str.contains("a") || str.contains("A"))
				.forEach(System.out::println);
		
		// 5. Replace 'a' with '@' in each string
		System.out.println("5. Strings after replacing 'a' with '@':");
		stringList.stream()
				.map(str -> str.replace("a", "@").replace("A", "@"))
				.forEach(System.out::println);
		
		// 6. Check if strings start with a specific letter
		System.out.println("6. Strings starting with 'J':");
		stringList.stream()
				.filter(str -> str.startsWith("J"))
				.forEach(System.out::println);
		
		// 7. Check if strings end with a specific letter
		System.out.println("7. Strings ending with 'g':");
		stringList.stream()
				.filter(str -> str.endsWith("g"))
				.forEach(System.out::println);
		
		// 8. Convert all strings to a single concatenated string
		System.out.println("8. Concatenated string:");
		String concatenatedString = stringList.stream()
				                            .reduce("", (str1, str2) -> str1 + str2);
		System.out.println(concatenatedString);
		
		// 9. Find the first string that contains the letter 'o'
		System.out.println("9. First string containing 'o':");
		stringList.stream()
				.filter(str -> str.contains("o") || str.contains("O"))
				.findFirst()
				.ifPresent(System.out::println);
		
		// 10. Sort the strings alphabetically
		System.out.println("10. Sorted strings:");
		stringList.stream()
				.sorted()
				.forEach(System.out::println);
	}
}
