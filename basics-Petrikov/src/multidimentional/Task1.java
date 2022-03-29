package multidimentional;

public class Task1 {


	public static void main(String[] args) {
		printMatrixOfArray();
	}

	public static void printMatrixOfArray() {

		int[][] array = { { 1, 3, 8, 6, 5 }, { 12, 17, 11, 18, 16 }, { 23, 27, 24, 22, 21 }, { 6, 6, 6, 6,
			6 } };System.out.println("For { { 1, 2, 3, 4, 5 }, { 12, 13, 14, 15, 16 }, { 22, 23, 24, 25, 26 }, { 6,6,6,6,6 } }\nIt will be the next matrix: ");for(
					int i = 0;i<array.length;i++)
			{
				System.out.println();
				for (int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j] + "\t");
				}
	}
	}
}
