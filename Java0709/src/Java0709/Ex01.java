package Java0709;

import java.util.Scanner;

public class Ex01 {
	
	/**
	 * @param a
	 * @param b
	 * 내용 작성
	 */
	public static void swap(int a, int b) {
		int temp = a;
        a = b;
        b = temp;
        System.out.printf("%d, %d\n",a,b);
//        a,b 는 지역변수다
	}
	public static int getCount(String msg, Scanner scan) {
		 System.out.println(msg);
         String input = scan.nextLine();
		 return Integer.parseInt(input);
		 
	}
	public static int getInt(String msg, Scanner scan) {
		 System.out.println(msg);
         String input = scan.nextLine();
		 return Integer.parseInt(input);
		 
	}
	/**
	 * @param args
	 * @since 1.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub        
		//byte x = -129;
		//short a2 = 32768;
//        int x = 0b1010;
//        System.out.println(x);
//        char var1 = '가'+1;
//        System.out.println(var1);
//        System.out.println(var1 + 1);
//        System.out.printf("%d\n", x);
//        System.out.printf("%c\n",var1);
//        int x1 = 10;
//        int y1 = 20;
//        System.out.printf("%d, %d\n",x1,y1);

//        int temp;
//        temp = x1;
//        x1 = y1;
//        y1 = temp;
//        swap(x1,y1);    
//        var t = 200;
//        var c = "가나다";
//        int kk;
//        System.out.println(kk);
		  Scanner sc = new Scanner(System.in);
          
		  int n1 = getInt("첫번째 숫자:",sc);
		  int n2= getInt("두번째 숫자:",sc);
		  
		  if(n1 > n2) {
			  System.out.printf("큰 숫자는 %d\n ",n1);
		  }else if(n1 <n2) {
			  System.out.printf("큰 숫자는 %d\n ",n2);
		  }else {
			  System.out.println(0+"(두 수가 같음)");
		  }
		  
//		  int result = (n1 > n2) ? n1 : (n1 < n2) ?  n2 : 0;
//		  System.out.println(result);
      }
	
}
