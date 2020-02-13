
public class FibonaciSeries {

	static int a = 0, b = 1, c;

	public static void fibonaciSeries(int number) {

		for (int i = 0; i <= number; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;

		}

	}

	public static void main(String[] args) {

		System.out.println(a);
		System.out.println(b);
		fibonaciSeries(5);

	}

}
