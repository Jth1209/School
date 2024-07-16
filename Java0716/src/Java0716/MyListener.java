package Java0716;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {//추상 메소드가 표준

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("클릭!");
	}
}
