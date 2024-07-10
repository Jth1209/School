package Java0710;

public class Ex01 {

	public static void main(String[] args) {
		String str1 = 10+"";
		String str2 = String.valueOf(10);
		String s1 = "3.14";
		double i1 = Double.parseDouble(s1) ;
		String s2 = 10 + "가나다";
	
		System.out.println(i1);
		// TODO Auto-generated method stub
//		byte b1 = -65;
//		char c1 = (char) b1;
//		System.out.println(c1);
		
//		int x = 200;
//		byte b = (byte) x;
//		System.out.println(b);
		
		double d1 = 3.14;
		int z = (int) d1;
		System.out.println(z);
		
		byte a1 = 10;
		byte a2 = 20;
		byte c3 = (byte) (a1 + a2);
//		int s1 = a1 + a2;
		
		float f1 = (float)(1.5 + 3.4);
		System.out.println(f1);
		
		int x = 1;
		int y = 3;
		int x3 = x/y;
		System.out.println(x3);
		double result = (double)x / y;
		System.out.println(result);
	}

}
