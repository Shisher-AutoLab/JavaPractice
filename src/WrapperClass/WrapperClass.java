package WrapperClass;

public class WrapperClass {

	public static void main(String[] args) {
		
		int i = 0;
		String k= "200"; 
		
		int j = Integer.parseInt(k);
		System.out.println(j);
		
		String u = String.valueOf(i);
		System.out.println(u);
		
		String y= "100A";  // This wr format will give number format exception
		int a= Integer.parseInt(y);
		System.out.println(a);

	}

}
