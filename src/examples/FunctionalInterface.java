package examples;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

public class FunctionalInterface {
	public static void main(String[] args) {

		// it takes one parameter and performs operation
		UnaryOperator<Integer> unaryOperator = x -> 3 * x;
		System.out.println(unaryOperator.apply(10));

		// same as Predicate but it takes 2 inputes 2 inputes to lambda expression and return the true fakse
		BiPredicate<Integer, String> bpTest = (number, str) -> {
			return number < 10 && str.length() > 5;
		};
		System.out.println(bpTest.test(5, "Prasad"));
		
        //can take 2 inouts and return one outpurback, output can be of different also
		BiFunction<Integer, String, String> biFunction = (number, str) -> {
			return number + " " + str;
		};

		System.out.println(biFunction.apply(15, "in28minutes"));
		
       //same as consumer in consumer it gives only one Input but BiConsumer gives 2 inputes  
		BiConsumer<Integer, String> biConsumer = (s1, s2) -> {
			System.out.println(s1);
			System.out.println(s2);
		};
		biConsumer.accept(25, "in28Minutes");
	}
}
