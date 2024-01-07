package examples;

import java.util.List;

public class PrintAllNumber {
	public static void main(String[] args) {
		List<Integer> num = List.of(12, 13, 4, 5);

		List<String> courses = List.of("Spring", "Spring Boot", "Spring MVC", "API", "Microservice", "AWS");

		printAllNumber(num);
		printAllNumnberUsingJava(num);
		printEven(num);
		printAllNumnberUsingJavaFunctionalApproch(num);
		usinglambda(num);
		oddNumberlambda(num);
		printAllCoursesList(courses);
		printSquaresOfEvenNumbers(num);
		cubeOfOddNumbers(num);

		int sum = sumOfNumbnerInListOldMethod(num);
		System.out.println("sum of numbers in List is: " + sum);

		int sumfun = newFunctionalApproch(num);
		System.out.println("sum of number in List is using functional approch :" + sumfun);

		int newFunctionalApprochUsingLambda = newFunctionalApprochUsingLambda(num);
		System.out.println(newFunctionalApprochUsingLambda);

		int result = newFunctionalApprochUsingLambda(num);
		System.out.println(result);
  
		int result2 = newFunctionalApprochUsingBuiltInIntegerMethod(num);
		System.out.println(result2);
		
		int sumOfSqquareUsingFun = sumOfSqquareUsingFun(num);
		System.out.println(sumOfSqquareUsingFun);


	}

	// how to iterate means follows how to solve the problem
	// below code will print all the number in list this is bfore java 8
	private static void printAllNumber(List<Integer> numbers) {
		for (int number : numbers) {
			System.out.println("old method" + number);
		}
	}

	// printing the even number using old method if we divide the number by two and
	// op is zero then thats even number
	private static void printEven(List<Integer> numbers) {
		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.println("Even Number: " + number);

			}
		}
	}

	// using java 8 its follows what to do
	private static void printAllNumnberUsingJava(List<Integer> numbers) {
		numbers.
		stream().
		forEach(System.out::println);

	}
	/*
	 * Approch 1 for functional style is create one separate method for even number
	 * print
	 */

	private static boolean evenNumFunction(int number) {
		return number % 2 == 0;
	}

	// using functional approch
	private static void printAllNumnberUsingJavaFunctionalApproch(List<Integer> numbers) {
		numbers.
		stream().
		filter(PrintAllNumber::evenNumFunction).
		forEach(System.out::println);
	}

	/*
	 * Approch 2 for functional style make use of lambda function
	 */

	private static void usinglambda(List<Integer> numbers) {
		numbers.
		stream().
		filter(number -> number % 2 == 0)// lambda expression
        .forEach(System.out::println);// method reference
	}

	private static void oddNumberlambda(List<Integer> numbers) {
		numbers.
		stream().
		filter(number -> number % 2 != 0)// lambda expression
				.forEach(System.out::println);// method reference
	}

	private static void printAllCoursesList(List<String> cources) {
		cources.
		stream().
		forEach(System.out::println);

		cources.
		stream().
		filter(containCourse -> containCourse.
				contains("Spring")).
		forEach(System.out::println);

		cources.
		stream().
		filter(containCourse -> containCourse.
				length() >= 4).
		forEach(System.
				out::println);

		cources.
		stream().
		map(cource -> cource + " " + cource.
				length()).
		forEach(System.
				out::println);

	}

	private static void printSquaresOfEvenNumbers(List<Integer> squearnum) {
		squearnum.
		stream().
		filter(num -> num % 2 == 0).
		map(numb -> numb * numb).
		forEach(System.
				out::println);
	}

	private static void cubeOfOddNumbers(List<Integer> cubernum) {
		cubernum.
		stream().
		filter(cubnum -> cubnum % 2 != 0).
		map(cubnumber -> cubnumber * cubnumber * cubnumber)
				.forEach(System.
						out::println);
	}

	/* sum of number n list */
	private static int sumOfNumbnerInListOldMethod(List<Integer> sum) {
		int sumnum = 0;

		for (int numm : sum) {
			sumnum += numm;
		}
		return sumnum;
	}

	private static int sumcal(int a, int b) {
		return a + b;
	}

	/*
	 * aprroch 1 for adding number in list is create one method which returns the
	 * sum of 2 integer and use reduce function of stream
	 */
	private static int newFunctionalApproch(List<Integer> sum) {
		return sum.stream().reduce(0, PrintAllNumber::sumcal);
	}

	/*
	 * approch 2 using lambda expression
	 */

	private static int newFunctionalApprochUsingLambda(List<Integer> sum) {
		return sum.stream().reduce(0, (x, y) -> x + y);
	}

	/*
	 * approch 3 using built in sum function it will calculate all the sum of
	 * element in list
	 */

	private static int newFunctionalApprochUsingBuiltInIntegerMethod(List<Integer> sum) {
		return sum.stream().reduce(0, Integer::sum);
	}
	
	private static int sumOfSqquareUsingFun(List<Integer> squareSum) {
		
		return squareSum.stream().map(x->x*x).reduce(0, Integer::sum);
	}
}
