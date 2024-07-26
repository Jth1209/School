package templateMethod;

public abstract class AbstractDisplay {
	public abstract void open();
	public abstract void print();
	public abstract void close();
	
	public final void display() {//재정의 할 수 없는 설계도
		open();
		for(int i = 0; i< 5; i++) {
			print();
		}
		close();
	}
}
