
public class SumOfnNumbers {
	
	public static void sumOfnNumbers(int n) {
		
		int temp = 0;
		for (int i = 0; i<=n; i++) {
			temp = temp+i;
		}
		
		System.out.println(temp);
	}

	public static void main(String[] args) {
		sumOfnNumbers(100);
	}

}
