package java0725;

public class Ex3 {

	public static void main(String[] args) {
		String data = args[0];
		System.out.println(data);
		int num = 0;
		try {
			num = Integer.parseInt(data);
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
