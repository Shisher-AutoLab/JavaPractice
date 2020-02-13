package practice;

public class FibinaciSeries {

	static int f1, f2 = 0, f3 = 1;

	public static void fibonaci(int num) {

		for (int i = 0; i < num; i++) {
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;
			System.out.println(f3);
		}
	}

	public static void fibonaciRec(int num) {
		if (num >= 1) {
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;
			System.out.println(f3);
			fibonaciRec(num - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(f1);
		System.out.println(f2);
		fibonaciRec(5);

	}

}
