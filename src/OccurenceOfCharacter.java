import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacter {

	public static void countOccurence(String strOccurence) {

		Map<Character, Integer> charseq = new HashMap<>();

		for (Character c : strOccurence.toCharArray()) {

			if (charseq.containsKey(c)) {
				charseq.put(c, charseq.get(c) + 1);
			} else {
				charseq.put(c, 1);
			}

		}
		
		System.out.println(charseq);

	}

	public static void main(String[] args) {
		
		countOccurence("i love wipro");

	}

}
