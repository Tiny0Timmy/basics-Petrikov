package onedimentional;

import java.util.Arrays;

import util.Array;
import util.Console;

public class Task2 {

	public static void main(String[] args) {
		int numbers = Console.getAndReadImputInt(1, "Please, enter quantity of numbers: ");
		int max = 50;
		int min = -20;
		double[] array = Array.getRandomDouble(numbers, max, min);
		Result result = findNumbersBelowAboveOrEqualZero(array);
		System.out.println(Arrays.toString(array));
		Array.printDouble(array);
		System.out.println("Numbers below zero - " + result.lessZero);
		System.out.println("Numbers above zero - " + result.moreZero);
		System.out.println("Numbers equal to zero - " + result.equalsZero);
	}

	private static Result findNumbersBelowAboveOrEqualZero(double[] array) {
		Result result = new Result();
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				result.lessZero++;
			} else if (array[i] > 0) {
				result.moreZero++;
			} else {
				result.equalsZero++;
			}
		}
		return result;
	}
	
	private static class Result {
		int lessZero;
		int moreZero;
		int equalsZero;
	}
}
