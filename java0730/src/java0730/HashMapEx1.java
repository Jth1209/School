package java0730;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String , Integer> map = new HashMap<>();//map의 제네릭 내부에 primitive 자료형은 들어갈 수 없다.
		map.put("신용권",85);
		map.put("신용권",95);
		map.put("홍길동",95);
		map.put("신용권",80);//key의 값이 같으면 저장공간을 하나만 할당받음
		System.out.println(map.size());
		System.out.println(map.get("홍길동"));//key의 값이 같다면 제일 마지막에 put해준 value 값을 리턴한다.
		
//		Set<String> kk = map.keySet();
//		Iterator<String> it = kk.iterator();
//		while(it.hasNext()) {
//			String mk = it.next();//키값을 가지고 와서
//			Integer mi = map.get(mk);//위에 선언했던 map을 통해 get으로 value 값을 가지고 온다
//			System.out.println(mi);//출력하면 됨
//		}
		Set<String> kk = map.keySet();//keySet()
		for(String str : kk) {//iterator 쓰기 싫으면 enhanced for문 써도 됨 
			Integer mi = map.get(str);
			System.out.println(mi);
		}
		
		Set<Map.Entry<String, Integer>> me = map.entrySet();//entrySet()
		for(Map.Entry<String, Integer> kv : me) {
			String str = kv.getKey();
			Integer mi = kv.getValue();
			String msg = MessageFormat.format("{0},{1}", str,mi);//MessageFormat.format(출력될 모양의 문장, 넣을 변수); 뒤에 들어올 변수의 순서를 적어주면 됨(index)
			System.out.println(msg);
		}
	}

}
