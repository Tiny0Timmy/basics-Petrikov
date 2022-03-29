package linear;

import util.Console;

public class Task4 {

	public static void main(String[] args) {
		System.out.println("z = (b + (b^2 + 4ac)^-2) \\ 2a - a^3c + b^-2)");

		int a = Console.getAndReadImputInt(4,"Please, enter a: ");
		int b = Console.getAndReadImputInt(4,"Please, enter b: ");
		int c = Console.getAndReadImputInt(3,"Please, enter c: ");

		double answer = Math.pow((b + (b * b + 4 * a * c)), (-2)) / (2 * a) - (Math.pow(a, 3) * c + Math.pow(b, -2));
		System.out.println("z = " + answer);
	}
}
