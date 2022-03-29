package linear;


import util.Console;

public class Task3 {

	public static void main(String[] args) {
		int T = Console.getAndReadImputInt(4, "Please, enter T: ");
		int hours = T / 3600;
		int minutes = T % 3600 / 60;
		int seconds = T % 3600 % 60;
		System.out.print(+hours + "h " + minutes + "min " + seconds + "s");
	}

}
