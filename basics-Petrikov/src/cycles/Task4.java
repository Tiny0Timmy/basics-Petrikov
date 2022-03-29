package cycles;

public class Task4 {

	public static void main(String[] args) {
		printTabelOfCharSimbols();
}

	public static void printTabelOfCharSimbols() {
		int i = 31;
		for (char k = 32; k < 128; k++) {
			i++;
			System.out.print(i);
			System.out.print("=> \"" + k + "\"\t");
			if ((i + 1) % 4 == 0) {
				System.out.println();

			}
		}		
	}
}