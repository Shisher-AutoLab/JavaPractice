
public class Factorial {

	public static void factorial(int num) {
		int temp = num;
		int c = 1;

		if (num == 1) {
			System.out.println(1);
		}

		else if (num == 0) {
			System.out.println(0);
		} else {

			while (num > 0) {

				c = num * c;
				num--;
			}
			System.out.println(c);
		}

	}

	public static int factorialRecurssion(int n) {

		if (n == 1) {
			//System.out.println(1);
			return 1;
		} else if (n == 0) {
			//System.out.println(0);
			return 0;
		} else {
			int output = factorialRecurssion(n - 1) * n;
			return output;
		}

	}

	public static void main(String[] args) {

		int fac = factorialRecurssion(5);
		System.out.println(fac);
	}

}
