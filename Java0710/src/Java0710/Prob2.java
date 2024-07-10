package Java0710;

public class Prob2 {

	public static void main(String[] args) {
		int i = 0;//값의 초기화는 굉장히 중요하다.
		int result = 0;
		int j = 1;
		for(i = 0; i < 101; i++) {
			 result += i;
		}//더하기 반복문(for)
//		while( j < 101) {
//			result += j;
//			j++;
//		}//더하기 반복문(while)
		
//		do {
//			result += j;
//			j++;
//		}while( j < 101)//더하기 반복문(while)
		System.out.println(result);
	}

}
