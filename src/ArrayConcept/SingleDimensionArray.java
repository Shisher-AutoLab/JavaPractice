package ArrayConcept;

public class SingleDimensionArray {

	public static void main(String[] args) {
		
		//Array to store similar data type value in a array variable.
		//1 dim array
		int i[] = new int [5];
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		i[3] = 4;
		i[4] = 5;
		
		System.out.println("========== " +i[0]);
		for (int j = 0; j<i.length; j++) {
		System.out.println(i[j]);
		}
		System.out.println("Lopp completed");
		
		Object obj[] = new Object[5];
		obj[0] = "Shisher";
		obj[1] = 29;
		System.out.println("========== " +obj[0]);
		for (int j = 0; j<i.length; j++) {
		System.out.println(obj[j]);
		
		}
		
		
		

	}

}
