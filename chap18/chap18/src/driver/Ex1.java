package driver;

import mvc.command.CommandHandler;

class Aaa{
	void disp() {
		System.out.println("Aaa");
	}
}

public class Ex1 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> handlerClass = Class.forName("driver.Aaa");
        Object handlerInstance = 
                (Object) handlerClass.newInstance();
        Aaa aa = (Aaa)handlerInstance;
        aa.disp();
	}

}
