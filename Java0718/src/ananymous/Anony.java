package ananymous;

public class Anony {
	void method() {
		Person3 person3 = new Person3() {//인터페이스의 익명 객체 생성(자동 생성)	
			
			@Override
			public void wake() {
				
				
			}
		};
		
		Person2 person2 = new Person2() {

			@Override
			void wake() {
				
			}
			
		};//익명의 객체1 추상 클래스(자동 생성됨)
		
		Person person = new Person() {//익명의 객체 생성 2 일반 클래스
			void walk() {
				System.out.println("학교갈 준비");
			}

			@Override
			void wake() {
				System.out.println("5시 반에 일어났어요");
			}
			
		};
		
	}
	
}
