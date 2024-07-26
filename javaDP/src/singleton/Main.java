package singleton;

public class Main {
	public static void main(String[] args) {//접근 제한자를 잘 생각해서 작성
		Singleton sg = Singleton.getSingleton();
		Singleton sg2 = Singleton.getSingleton();
		
		System.out.println(sg.equals(sg2));
	}
}
