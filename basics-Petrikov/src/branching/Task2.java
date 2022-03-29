package branching;
import util.Console;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("y = x^2-3x+9; if x<=3\ny = 1\\(x^3+6); if x>3");
		double x = Console.getAndReadImputDouble(1.0,"Please, enter : x");
		getAndPrintAnswerToEquation(x);
	}
	public static void getAndPrintAnswerToEquation (double x) {
		if (x <= 3) {
			double answer = 1.0 / (Math.pow(x, 3) + 6);
			System.out.println("y = " + answer);
		}
		
		else {
			double answer = (Math.pow(x, 2)) - 3 * x + 9;
			System.out.println("y = " + answer);
		}
		
	}
}
