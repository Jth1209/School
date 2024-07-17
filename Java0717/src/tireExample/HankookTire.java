package tireExample;

public class HankookTire extends Tire{
	
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}

	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire의 수명"+(maxRotation - accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***"+ location +"HankookTire 평크 ***");
			return false;
		}
	}
}
