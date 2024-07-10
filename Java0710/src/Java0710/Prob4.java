package Java0710;

public class Prob4 {

	public static void main(String[] args) {
		int i = 0;
		int result = 0;
		for(int j = 0; j < 100; j++) {
			 i= i + 1;
			 if( i%2==0 ) {
			 result += i;
			 }
		}
		System.out.println(result);
	}

}