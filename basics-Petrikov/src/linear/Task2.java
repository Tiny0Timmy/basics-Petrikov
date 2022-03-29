package linear;

import java.text.DecimalFormat;

import java.util.Scanner;

import util.Console;

public class Task2 {

	public static void main(String[] args) {
		double R = Console.getAndReadImputDouble(4.0, "Please, enter R: ");

		DecimalFormat df = new DecimalFormat("###.###");

		double firstpart = R % 1;

		double secondpart = firstpart * 1000;

		double thirdpart = (R - firstpart) / 1000;

		double answer = secondpart + thirdpart;
		System.out.println("Reversed R = " + df.format(answer));

	}

}
