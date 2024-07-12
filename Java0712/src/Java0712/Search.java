package Java0712;

public class Search {

	public static void main(String[] args) {
		int[] a = {10,3,1,4,2};
		int var = 4;
		int find = -1;//찾기 전
		
		for(int i = 0; i<a.length; i++) {
			if(a[i] == var) {
				find = i;
				break;
			}
		}
		System.out.println("인덱스:" + find);
	}

}
