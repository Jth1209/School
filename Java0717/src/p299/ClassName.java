package p299;

public class ClassName {
	int field1;
	void method1() {};//Instance field and method 객체를 생성해야 메모리에 올라감 (객체 생성 후 사용 가능)
	
	static int field2;
	static void method2() {};//Static field and method 메모리에 바로 올리감 (바로 사용 가능)
	
	public static void main(String[] args) {//static 과 Instance의 메모리 영역이 다르다.
		ClassName cn = new ClassName();
		
		ClassName.method2();
		System.out.println(ClassName.field2);
	}
}
