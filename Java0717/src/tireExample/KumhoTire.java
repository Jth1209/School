package tireExample;

public class KumhoTire extends Tire{
	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}

	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire의 수명"+(maxRotation - accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***"+ location +"KumhoTire 평크 ***");
			return false;
		}
	}
}
