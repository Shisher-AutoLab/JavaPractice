import java.util.Arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 5, 25, 8, 4 };
		int b = 0;

		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {
			b= i+1;
			if(b!=a[i]) {
				System.out.println(b);
			}

		}

	}

}
