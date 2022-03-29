package cycles;


public class Task3 {

	public static void main(String[] args) {
		getAndPrintSumOfSquares();
	}
	public static void getAndPrintSumOfSquares () {
		long sum = 0;
		for(long i = 0; i<=100; i++) {
			sum +=i*i;
		}
		System.out.println(sum);
		
	}
}
