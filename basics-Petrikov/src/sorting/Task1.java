package sorting;

import util.Array;
import util.Console;

public class Task1 {

	public static void main(String[] args) {
		int Numbers = Console.getAndReadImputInt(1, "Please, enter quantity of numbers: ");
		int max = 1000;
		int min = 0;
		int[] mass = Array.getRandomInt(Numbers, max, min);
		
		Array.printInt(mass);
		Array.sortInt(mass);
		Array.printInt(mass);
	}
}