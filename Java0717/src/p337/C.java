package p337;

public class C extends P{

	public C(int x) {
		super(x);
		x = 700;//super.x가 final이기 때문에 재정의 못함
	}
}
