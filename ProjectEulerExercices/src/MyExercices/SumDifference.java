package MyExercices;

public class SumDifference {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i<= 100; i++) {
			sum += i*i;
		}
		System.out.println(sum);

		int sum2 = 0;
		for (int j = 0; j <= 100; j++) {
			sum2 += j;
		}
		sum2 *= sum2;
		System.out.println(sum2);
		System.out.println(sum2 - sum);
	}

}
