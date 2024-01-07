package examples;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinAndMax {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 13, 8, 9, 85, 25);
		System.out.println("myList is: " + numbers);

		int maxNumberFromList = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Maximum number is " + maxNumberFromList);

		int minNum = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("minimum number is " + minNum);

		List<Integer> limitNumberList = numbers.stream().limit(5).collect(Collectors.toList());
		System.out.println("5 Limit Elements" + limitNumberList);

		List<Integer> skipExampleList = numbers.stream().skip(2).collect(Collectors.toList());
		System.out.println("Skipped List" + skipExampleList);

		// finding the second largest number
		int secondLargest = numbers.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst()
				.get();
		System.out.println("Second Largest Number is : " + secondLargest);

		// finding the second smallest number
		int secondSmallest = numbers.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
		System.out.println("Second Smallest Number is : " + secondSmallest);

		numbers.stream().forEach(System.out::println);
	}
}
