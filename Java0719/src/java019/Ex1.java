package java019;

public class Ex1 {
	public static void main(String[] args) { //throws ClassNotFoundException//예외를 회피하는 방법
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//클래스의 이름이 있는지 없는지 확인해주는 메소드 Class.forName()
			System.out.println("MySql Driver");
		} catch (ClassNotFoundException e) {
//			System.out.println(e.getClass());
			e.printStackTrace();
		}
	}
}
