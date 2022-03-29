package multidimentional;

import java.util.Arrays;

import util.Console;

public class Task2 {
	
	public static void main(String[] args) {
		int[] array1 = { 1, 3, 8, 6, 5 };
		int[] array2 = { 12, 17, 11, 18, 16 };
		int[] array3 = { 23, 27, 24, 22, 21 };
		int[] array4 = { 6, 6, 6, 6, 6 };
		int[][] arrayAll = { array1, array2, array3, array4 };
		System.out.println(
				"For { { 1, 2, 3, 4, 5 }, { 12, 13, 14, 15, 16 }, { 22, 23, 24, 25, 26 }, { 6,6,6,6,6 } }\nIt will be the next matrix: ");
		for (int i = 0; i < arrayAll.length; i++) {
			System.out.println();
			for (int j = 0; j < arrayAll[i].length; j++) {
				System.out.print(arrayAll[i][j] + "\t");
			}
		}
		int Numbers = Console.getAndReadImputInt(4,
				"\nIf you want to sort it from min to max press \"1\" \nIf you want to sort it from max to min press \"2\"");
	

		if (Numbers != 1 && Numbers != 2) {
			System.out.println("Wrong number entered, please enter \"1\" or \"2\"");
			return;
		}
		Arrays.sort(array1);
		Arrays.sort(array2);
		Arrays.sort(array3);
		Arrays.sort(array4);

		if (Numbers == 1) {
			for (int i = 0; i < arrayAll.length; i++) {
				System.out.println();
				for (int j = 0; j < arrayAll[i].length; j++) {
					System.out.print(arrayAll[i][j] + "\t");
				}
			}
		}
		if (Numbers == 2) {
			for (int i = 0; i < arrayAll.length; i++) {
				System.out.println();
				for (int j = arrayAll[i].length - 1; j >= 0; j--) {
					System.out.print(arrayAll[i][j] + "\t");
				}
			}
		}
	}
}