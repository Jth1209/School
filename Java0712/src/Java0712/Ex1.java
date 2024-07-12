package Java0712;

public class Ex1 {

	public static void main(String[] args) {
		int[] num = new int[6];
		
		for(int i = 0; i < num.length; i++) {
//		    System.out.println((Math.random()*10) + 1);
			num[i] =(int) (Math.random()*45) + 1;// 0 ~ 1 -> 1 ~ 7 => 1부터 6까지 임의의 수 출력
		}
	}
}
