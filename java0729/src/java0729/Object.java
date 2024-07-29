package java0729;

import java.util.Date;

class Aa{
	String ss= "Aa 클래스";

	@Override
	public String toString() {//재정의
		return "Aa [ss = " + ss + "]";
	}
	
}

public class Object {
	public static void main(String[] args) {
		Object obj = new Object();
		Date obj2 = new Date();
		System.out.println(obj.toString());//내부적으로 알아서 toString()을 사용함
//		System.exit(0);//시스템 강제 종료(정상 종료)
		System.out.println(obj2);
		Aa aa = new Aa();
		System.out.println(aa);
		Class clazz = Aa.class;
		System.out.println(clazz);
	}
}
