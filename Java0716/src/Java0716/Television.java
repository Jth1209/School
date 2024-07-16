package Java0716;

public class Television implements RemoteControl {

	private int volume;
	
	public void turnOn() {
		System.out.println("티비를 켰습니다.");
	}//==public abstract void turnOn();
	public void turnOff() {
		System.out.println("티비를 껏습니다.");
	}
	public void setVolume(int volume) {
	}

}
