package onedimentional;

import util.Array;
import util.Console;

public class Task3 {
	
	public static void main(String[] args) {
		
		int Numbers = Console.getAndReadImputInt(1, "Please, enter quantity of numbers: ");
		System.out.print("Old order: ");
		int max = 100;
		int min = 0;
		int[] mass = Array.getRandomInt(Numbers, max,min);
		Array.printInt(mass);
		int minValue = mass[0];
		getMinNumber(mass, minValue);
		System.out.print("\nNew order: ");
		printArrayWithoutMinValue(mass, minValue);
		System.out.println("\nMin number is " + minValue);
	}

	private static int  getMinNumber(int[] mass, int minValue) {
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] < minValue) {
				minValue = mass[i];
			}
		}
		return minValue;
	}
	
	private static void printArrayWithoutMinValue(int[] mass, int minValue) {
		System.out.print("{");
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] != minValue) {
				System.out.print(mass[i]);
				if (i != mass.length - 1) {
					System.out.print(", ");
				}
			}
		}
		System.out.print("}");
	}
}