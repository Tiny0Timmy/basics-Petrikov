package cycles;

import util.Console;

public class task2 {

	public static void main(String[] args) {
		int a = Console.getAndReadImputInt(1, "Please, enter a: ");
		int b = Console.getAndReadImputInt(1, "Please, enter b: ");
		int h = Console.getAndReadImputInt(1, "Please, enter c: ");
		getAndPrintAnswer(a, b, h);
	}

	public static void getAndPrintAnswer(int a, int b, int h) {
		for (int i = a; i <= b; i += h) {
			int x = i;
			int y;
			if (x > 2) {
				y = x + 4;
			} else {
				y = -x * 2;
			}
			System.out.println("y = " + y);

		}
	}
}
