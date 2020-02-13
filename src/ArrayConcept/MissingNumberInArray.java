package ArrayConcept;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,8,9};
		int b = 0;
		
		//System.out.println(a.length);
		
		for (int i = 0; i<a.length; i++) {
			b = i+1;
			if(b!=a[i]) {
				System.out.println(b);
			}
		}
		

	}

}
