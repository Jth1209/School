package swing;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MyFrame {
	public static void main(String... args) {
		new MouseListenerEx();//객체
	}
}

class MouseListenerEx extends JFrame{//마우스 이벤트 클래스
	JPanel jp = new JPanel(); //Flow Layout이 기본값
	JLabel la = new JLabel("No Mouse Event");
	
	MouseListenerEx(){
		this.setContentPane(jp);//판넬을 붙이는 명령어
		this.add(la);//판넬 위에 레이블 추가하기
		this.setSize(900,700);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//윈도우 x 표 누르면 메모리도 반환
		
		jp.addMouseListener(new MyMouseListener());//판넬 클릭 시 이벤트 발생할 수 있도록 객체 생성
		jp.addMouseMotionListener(new MyMouseListener());
	}
		
	class MyMouseListener implements MouseListener,MouseMotionListener{//마우스 이벤트 관련 메소드를 가진 인터페이스

		@Override
		public void mouseClicked(MouseEvent e) {
			la.setText(("click("+e.getX()+","+ e.getY())+")");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			la.setText(("pressed("+e.getX()+","+ e.getY())+")");
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText(("Released("+e.getX()+","+ e.getY())+")");			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			jp.setBackground(Color.BLUE);
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			jp.setBackground(Color.DARK_GRAY);
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText(("Dragged("+e.getX()+","+ e.getY())+")");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText(("mouseMoved("+e.getX()+","+ e.getY())+")");
		}
		
	}
}

