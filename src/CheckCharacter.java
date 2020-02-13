
public class CheckCharacter {

	public static void main(String[] args) {

		String s = "IndIa";
		
		for(int i = 0; i<s.length(); i++) {
			int counter = 0;
			for (int j = 0; j<s.length(); j++) {
				if(s.charAt(i)== s.charAt(j)) {
					counter++;
					//System.out.println("Character of " +s.charAt(j)+ "-" +counter);
				}
				if(j<i && s.charAt(i)== s.charAt(j)) {
					break;
				}
				
				if(j==s.length()-1) {
					
					System.out.println("Character of " +s.charAt(i)+ "-" +counter);
					
				}
			}
			;
		}
		
		
		
	}

}
