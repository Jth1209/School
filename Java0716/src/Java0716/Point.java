package Java0716;

public class Point {
	
	int x,y;
	
	Point() {System.out.println("부모 기본 생성자 호출");}
	Point(int x , int y) {
		this.x = x; 
		this.y = y;}
	void method1() {
		System.out.println(x +","+ y);
	}
}
