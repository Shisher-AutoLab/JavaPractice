
public class FibonaciSeriesRecur {

	static int a = 0, b = 1, c = 0;

	public static void main(String[] args) {

		System.out.println(a);
		System.out.println(b);
		printFibo(10);
	}

	static void printFibo(int i) {

		if (i >= 1) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
			printFibo(i - 1);

		}

	}

}
