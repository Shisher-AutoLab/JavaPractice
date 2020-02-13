package Practise1;

public class ArmstrongNumber {

	public static void palinCheck(int num) {

		int temp = num;
		int c=0;
		int k;

		while (temp > 0) {
			k = temp%10;
			c = c + (k * k * k);
			temp = temp / 10;
		}
		System.out.println(c);
		
		if(c==num) {
			System.out.println("Number is armstrong");
		}else {
			System.out.println("Number is not armstrong");
		}
		
	}

	public static void main(String[] args) {

		palinCheck(251);

	}

}
