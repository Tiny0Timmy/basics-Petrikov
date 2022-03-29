package cycles;

import util.Console;

public class task1 {

	public static void main(String[] args) {

		int number = Console.getAndReadImputInt(4, "Please, enter number: ");
		getAndPrintSumOfsqaresOfNumber(number);
	}
	public static void getAndPrintSumOfsqaresOfNumber(int number){
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			sum += i;
		}
		
		System.out.println("Sum is " + sum);
		
	}
}
