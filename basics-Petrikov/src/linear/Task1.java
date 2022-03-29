package linear;

import util.Console;

public class Task1 {

	public static void main(String[] args) {
		System.out.println("z = ((a-3)*b/2)+c\n");

		double a = Console.getAndReadImputDouble(5.0, "Please, enter a: ");

		double b = Console.getAndReadImputDouble(5.0, "Please, enter b: ");

		double c = Console.getAndReadImputDouble(5.0, "Please, enter c: ");

		double z = ((a - 3) * b / 2) + c;
		System.out.println("\nz = " + z);

	}
}