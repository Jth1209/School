package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MyFrame extends JFrame {
	String[] stand = {"stand.gif"};//이미지를 배열로 만들어서 무한 반복
	String[] walk = {"walk1.gif","walk2.gif"};//이미지를 배열로 만들어서 무한 반복
	String[] run = {"run1.gif","run2.gif","run3.gif"};//이미지를 배열로 만들어서 무한 반복
	int flag = 0;
	String[] path = stand;
	MyFrame(){
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(1200,100,500,500);
		this.setLayout(new BorderLayout());
		
		Field1 field1 = new Field1();
		Control control = new Control();
		
		Thread th = new Thread(field1);
		th.start();
		
		this.add(field1,BorderLayout.CENTER);
		this.add(control,BorderLayout.SOUTH);
		
		
	}
	
	
	private class Field1 extends JPanel implements Runnable{
		JLabel jL1;
		Field1(){
			this.setLayout(new BorderLayout());
			jL1 = new JLabel();
			jL1.setIcon(new ImageIcon("./src/stand.gif"));
			this.add(jL1,BorderLayout.CENTER);
		}
		@Override
		public void run() {
			while(true){
				if(flag == 1) {
				path = stand;
				for(int i = 0; i < path.length; i++) {
					jL1.setIcon(new ImageIcon("./src/"+path[i]));
//					System.out.println(i);
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
				if(flag == 2) {
					path = walk;
					for(int i = 0; i < path.length; i++) {
						jL1.setIcon(new ImageIcon("./src/"+path[i]));
//						System.out.println(i);
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}	
				if(flag == 3) {
					path = run;
					for(int i = 0; i < path.length; i++) {
						jL1.setIcon(new ImageIcon("./src/"+path[i]));
//						System.out.println(i);
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}	
		}
	}
}
	
	
	private class Control extends JPanel implements ActionListener{
		private JButton standingBtn,walkingBtn,runningBtn;
		
		private Control() {
			this.setLayout(new FlowLayout());
			
			standingBtn = new JButton("Standing");//버튼 3개 선언
			walkingBtn = new JButton("Walking");
			runningBtn = new JButton("Running");
			
			standingBtn.addActionListener(this);//스스로를 행동으로 설정
			walkingBtn.addActionListener(this);
			runningBtn.addActionListener(this);
			
			this.add(standingBtn);//만들어진 패널에 버튼 3개 삽입
			this.add(walkingBtn);
			this.add(runningBtn);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == standingBtn) {
				 flag = 1;
			}else if(e.getSource() == walkingBtn) {
				 flag = 2;
			}else if(e.getSource() == runningBtn) {
				 flag = 3;
			}
		}
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}
