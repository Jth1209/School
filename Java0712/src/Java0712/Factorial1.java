package Java0712;

public class Factorial1 {
	public static int fac2(int n) {//재귀호출 형식 메소드(recrusive)
		if(n == 0) {
			return 1;
		}else {
			return n * fac2(n-1);
		}
	}
	
	public static int fac(int n) {
		int mul = 1;//곱 연산이기 때문에 0 넣으면 안됨.
		for(int i = 1; i< n + 1; i++) {//단순 반복문으로 팩토리얼
			mul *= i;
		}
		return mul;
	}

	public static void main(String[] args) {
		int num = 4;
		int result = fac2(num);
        System.out.println(result);
	}

}
