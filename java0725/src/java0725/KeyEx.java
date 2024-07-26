package java0725;

import java.util.HashMap;

public class KeyEx {

	public static void main(String[] args) {
//		HashMap<Integer, String> hashMap = new HashMap<>();
//		hashMap.put(1, "홍길동");
//		hashMap.put(2, "강하나");
//		String val = hashMap.get(2);
//		System.out.println(val);
		
		HashMap<Key, String> hashMap = new HashMap<Key,String>();
		hashMap.put(new Key(1), "홍길동");
		String val = hashMap.get(new Key(1));
		String val2 = hashMap.get(new Key(2));
		
		Key key1 = new Key(100);
		Key key2 = new Key(100);
		System.out.println(key1.hashCode());//key에 지정한 필드값을 hashcode()로 호출
		System.out.println(key2.hashCode());//key에 지정한 필드값을 hashcode()로 호출
		if(key1.equals(key2)) {//hashcode값으로 같은지 다른지를 비교하네 이새끼
			System.out.println("같다");
		}
//		System.out.println(val);
	}

}
