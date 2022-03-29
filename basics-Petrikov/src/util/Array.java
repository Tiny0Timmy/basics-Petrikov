package util;

public class Array {
	public static int[] getRandomInt(int length, int max, int min) {
		int[] mass = new int[length];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * (max - min) + min);
		}
		return (mass);
	}

	public static double[] getRandomDouble(int length, int max, int min) {
		double[] mass = new double[length];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (double) (Math.random() * (max - min) + min);
			System.out.println(mass[i]);
		}
		return mass;
	}

	public static void printInt(int[] mass) {
		System.out.print("{");
		for (int i = 0; i < mass.length; i++) {
			if (i != mass.length - 1) {
				System.out.print(mass[i] + ", ");
			} else {
				System.out.print(mass[i]);
			}
		}
		System.out.println("}");

	}

	public static void printDouble(double[] mass) {
		System.out.print("{");
		for (int i = 0; i < mass.length; i++) {
			if (i != mass.length - 1) {
				System.out.print(mass[i] + ", ");
			} else {
				System.out.print(mass[i]);
			}
		}
		System.out.println("}");

	}
	public static int[] sortInt (int[] mass){
		int buffer;
		for (int i = 0; i < mass.length - 1; i++) {
			for (int j = mass.length - 1; j > i; j--) {
				if (mass[j-1] > mass[j]) {

					buffer = mass[j - 1];
					mass[j - 1] = mass[j];
					mass[j] = buffer;
				}
			}
		}
		return mass;
	}
}