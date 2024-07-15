package Java0715;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("자바");
		list.add("Hello");
		
//		iterator (자바 디자인 패턴)
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
//		for(String str : list){
//			System.out.println(str);
//		}
		
		
		
	}

}
