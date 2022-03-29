package util;

import java.util.Scanner;

public class Console {

	public static int getAndReadImputInt(int defaultValue, String messageToUser) {

		System.out.print(messageToUser );
		int number;
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt())
			number = scanner.nextInt();
		else {
			System.out.println("Wrong number entered");
			System.out.println("Set to default");
			number = defaultValue;
		}

		return number;
	}

	public static Double getAndReadImputDouble(Double defaultValue, String messageToUser) {
		System.out.print(messageToUser);
		Double number;
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextDouble())
			number = scanner.nextDouble();
		else {
			System.out.println("Wrong number entered");
			System.out.println("Set to default");
			number = defaultValue;
		}

		return number;
	}
}