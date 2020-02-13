package String;

public class GetWordFromString {

	public static void main(String[] args) {
		
		
		String s = "This is my hexaware and our Hexaware";
		
		for (String str : s.split(" ")) {
			
			if(str.contains("hexaware")) {
				System.out.println(str);
			}
		
		
		}

	}

}
