
public class CheckNoPositiveOrNegative {
	
	
	public static boolean checkNumber(int number) {
		if(number>=0) {
			return true;
		}
		else {
			return false;
		}
	}
	

	public static void main(String[] args) {
		
		if(checkNumber(-1)) {
			System.out.println("Number is positive");
		}else {
			System.out.println("Number is negative");
		}
		

	}

}
