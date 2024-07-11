package Java0711;

import java.util.Scanner;
public class Prob1 {
    public static int getNum(String msg,Scanner scan) {
    	System.out.print(msg);
		String input1 = scan.nextLine();
		return Integer.parseInt(input1);
    }

	public static void main(String[] args) {
		boolean run1 = true;
		int balance = 0;
		String ID = "";
		String PW = "";
		String Name = "";
		Scanner sc = new Scanner(System.in);
		
        while(run1) {
			System.out.println("---------------------------");
			System.out.println("1.로그인 |2.회원 가입 |3.예금/출금 |4.종료 |");
			System.out.println("---------------------------");
			int select = getNum("선택> ",sc);
			//회원 가입
			if(select == 2) {//아이디 ,비밀번호 생성 
				System.out.print("예금주 이름: ");
				String name = sc.nextLine();
				System.out.print("아이디 생성: ");
			    String ip1 = sc.nextLine();
			    System.out.print("주민번호 : ");
		        String ip2= sc.nextLine();
		    
		        ID = ip1;
		        PW = ip2;
		        Name = name;
			}
			//로그인
			if(select == 1) {//아아디 , 비밀번호 대치 
				System.out.println("로그인 처리");
				System.out.print("아이디 입력: ");
			    String UID = sc.nextLine();
			    System.out.print("주민번호 입력: ");
			    String UPW = sc.nextLine();
			    if((ID.equals(UID)) && (PW.equals(UPW))) {
			        System.out.println("로그인 성공..."+ Name +"님");
				}else {
					System.out.println("아이디나 주민번호가 틀렸습니다. 다시 입력 해주세요.");
			    }
			//예금/출금
			}if(select == 3) {
				boolean run2 = true;
				while(run2) {
					System.out.println("-----------------------------");
					System.out.println("1.예금 | 2.출금 |3.잔고 | 4.종료 |");
					System.out.println("-----------------------------");
					int select1 = getNum("선택>",sc);
					
					if(select1 == 1) {
						int money = getNum("예금액>",sc);
						balance += money;
					}
					if(select1 == 2) {
						int money = getNum("출금액>",sc);
						balance -= money;
					}
					if(select1 == 3) {
						System.out.println("잔고> ");
						System.out.println(balance);
					}
					if(select1 == 4) {
						run2 = false;
					}
					
					}
				System.out.println("프로그램 종료");
			//종료
			}if(select == 4) {
				run1 = false;
			}
		}
        System.out.println("프로그램 완전 종료");

	}
}