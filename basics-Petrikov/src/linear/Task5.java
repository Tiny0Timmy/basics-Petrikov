package linear;


import util.Console;

public class Task5 {

	public static void main(String[] args) {
		System.out.println("z = ((sin x + cos y)\\(cos x - sin y))*tgxy");
		
		int x = Console.getAndReadImputInt(3,"Please, enter x: ");
		int y = Console.getAndReadImputInt(3,"Please, enter y: ");
		
		double answer = 1.0 * (Math.sin(x) + Math.cos(y) / (Math.cos(y) - Math.cos(x)) * Math.tan(x * y));
		System.out.println("z = " + answer);

	}
}
