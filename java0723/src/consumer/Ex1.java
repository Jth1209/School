package consumer;

import java.awt.event.FocusListener;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Ex1 {

	public static void main(String[] args) {
		Consumer<String> consumer = (t) ->{//Consumer Java 패키지
			System.out.println(t);
		};
		consumer.accept("테스트");
		
		BiConsumer<String,String> consumer1= (x,y)->{//매개변수의 개수가 2개인 Consumer Java 패키지
			System.out.println(x+y);
		};
		consumer1.accept("안녕 ", "오늘의 그대에게");
		
		
	}

}
