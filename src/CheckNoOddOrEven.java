
public class CheckNoOddOrEven {
	
	
	public static boolean checkNumber(int num) {
		
		if(num%2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		if(checkNumber(11)) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is Odd");
		}
		
	}

}
