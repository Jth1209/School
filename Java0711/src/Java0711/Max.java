package Java0711;

public class Max {
	public static void main(String[] args) {
		int[] a = {11,33,10,266,88};
		int max = a[0];
		int temp = 0;
		
		for(int i =0; i<a.length-1; i++) {
			if(a[i] < a[i+1]) {
				max = a[i+1];
			}else {
				a[i+1]= a[i];
				
			}
		}
		System.out.println(max);
	}
}
