package String;

public class CountCharacter {

	public static void main(String[] args) {
		
		String s = "INDIA is my counter and I love india";
		
		int counter = 0;
		
		/*for (String str : s.split("")) {
			
			if(str.equals("I")) {
				counter = counter+1;
			}
			
		}
		
		System.out.println(counter);

	}*/
		
		
		for (int i = 0; i<s.length(); i++) {
			
			if(s.charAt(i)=='I' || s.charAt(i)=='i') {
				counter++;
			}
			
		}
		
		System.out.println(counter);
		
	}
	

}
