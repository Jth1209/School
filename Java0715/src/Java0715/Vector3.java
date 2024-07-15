package Java0715;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Vector3 {

	public static void main(String[] args) {
		List<String> list = new Vector<>();
		
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
