
public class ReverseString {
	
	
	public static String reverString(String strEnterString) {
		
		String temp="";
		
		for(int i=strEnterString.length()-1; i>=0; i--) {
			temp = temp+strEnterString.charAt(i);
		}
		return temp;
	}

	public static void main(String[] args) {
		
		String str =  reverString("Shisher");
		System.out.println(str);
		

		
	}

}
