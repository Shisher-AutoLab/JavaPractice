package Practise1;

import java.lang.reflect.Array;

public class OccuenceOfNumberInArray {

	public static void main(String[] args) {

		
		int a[] = {1,2,3,2,1,2,3};
		
		Array[] b = new Array[a.length];
		
		for (int i = 0; i< a.length; i++) {
			int counter = 0;
			for (int j = 0; j<a.length; j++) {
				
				if(a[i]==a[j]) {
					counter++;
				}
				if(a[i]==a[j]) {
					break;
				}
			}
			
		}
		
		
		
		
	}

}
