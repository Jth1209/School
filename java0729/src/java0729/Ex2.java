package java0729;

public class Ex2 {

	public static void main(String[] args) {
		long time = System.nanoTime();
//		System.out.println(time);
		
		for(int i = 0; i<100000000; i++) {
			
		}//해당 기능의 수행 시간을 나노초 단위로 보여줌
		long time1 = System.nanoTime();
		System.out.println(time1-time);
	}

}
