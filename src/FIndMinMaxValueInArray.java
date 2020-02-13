import java.util.Arrays;

public class FIndMinMaxValueInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5,-20,100 };
		int largest = a[0];
		int smallest = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[i] > largest) {
				largest = a[i];
			} else if (a[i] < smallest) {
				smallest = a[i];
			}

		}
		
		System.out.println(Arrays.toString(a));
		System.out.println("Maximum number is " +largest);
		System.out.println("Minimum number is " +smallest);

	}

}
