package templateMethod;

public class Main2 {

	public static void main(String[] args) {
		StringDisplay sd = new StringDisplay("funk");
		sd.display();
		
		AbstractDisplay d2 = new StringDisplay("YASMOON");
		d2.display();
	}

}
