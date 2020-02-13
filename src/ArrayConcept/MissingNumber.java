package ArrayConcept;

public class MissingNumber {

	public static void main(String[] args) {

		
		int a[] = {1,2,3,2,5,8,4,9};
		int b[] = new int[a.length];
		
		for (int i : a) {
			b[i] = 1;
		}
		
		//System.out.println(b);
		
		for(int j= 0; j<=b.length; j++) {
			if(b[j]==0) {
				System.out.println(j);
			}
		}
		
	}

}
