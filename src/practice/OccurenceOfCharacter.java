package practice;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacter {

	public static void main(String[] args) {

		String s = "agsdfasdfasdf";
		Map<Character, Integer> map = new HashMap<>();
		for (Character c : s.toCharArray()) {
			
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);


	}

}
