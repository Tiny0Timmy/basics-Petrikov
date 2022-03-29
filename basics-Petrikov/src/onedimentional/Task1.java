package onedimentional;

import util.Array;
import util.Console;

public class Task1 {

	public static void main(String[] args) {
		int quantityOfNumbers = Console.getAndReadImputInt(6, "Please, enter quantity of numbers: ");

		int denominator = Console.getAndReadImputInt(5, "Please, enter denominator: ");
		int max = 50;
		int min = 0;
		int[] numbers = Array.getRandomInt(quantityOfNumbers, max, min);
		countAndPrintSumOfDenoinators(numbers, denominator);
	}
	public static void countAndPrintSumOfDenoinators (int[] numbers, int denominator) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % denominator == 0) {
				sum += numbers[i];
			}
		}
		if (sum == 0) {
			System.out.println("There are no multiples :( ");
		}
		
		else {
			System.out.println("Sum of multiples of denominator = " + sum);
		}
		
	}
}
