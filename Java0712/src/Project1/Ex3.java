package Project1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex3 {

	public static void main(String[] args) {
		Member[] list = {
		};
		
		try (FileOutputStream fos = new FileOutputStream("c:\\temp\\members.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(list);
			System.out.println("객체를 파일에 저장했습니다.");
		
		
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
