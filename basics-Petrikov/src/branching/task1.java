package branching;

import util.Console;

public class task1 {

	public static void main(String[] args) {

		double a = Console.getAndReadImputDouble(5.0, "Please, enter a: ");
		double b = Console.getAndReadImputDouble(5.0, "Please, enter b: ");
		double c = Console.getAndReadImputDouble(5.0, "Please, enter c: ");
		double d = Console.getAndReadImputDouble(5.0, "Please, enter d: ");
		double minAB = 0;
		double minCD = 0;
		getMaxFromMinABMinCD(minAB, minCD, a, b, c, d);
	}

	public static void getMaxFromMinABMinCD(double minAB, double minCD, double a, double b, double c, double d) {

		if (a < b) {
			minAB = a;
		} else {
			minAB = b;
		}
		if (c < d) {
			minCD = c;
		} else {
			minCD = d;
		}
		if (minAB > minCD) {
			System.out.println("Max is " + minAB);
		} else {
			System.out.println("Max is " + minCD);
		}
	}

}
