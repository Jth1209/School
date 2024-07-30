package java0730;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Prob1 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		List<Score> list = new ArrayList<>();
		
		String sql = "select * from score";
		
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		String id = "root";
		String pw = "mysql";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버  로딩");
			con = DriverManager.getConnection(URL,id,pw);
			System.out.println("Mysql 접속 성공!");
			pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				list.add(new Score(rs.getInt("num"),rs.getString("name"),rs.getInt("kor"),rs.getInt("eng"),rs.getInt("math")));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int korSum = list.stream().mapToInt(s->s.getKor()).sum();//해당 클래스의 값을 mapping해주는 메소드 (mapToInt)
		System.out.println(korSum);
		int engSum = list.stream().mapToInt(s->s.getEng()).sum();
		System.out.println(engSum);
		int mathSum = list.stream().mapToInt(s->s.getMath()).sum();
		System.out.println(mathSum);
		int totSum = list.stream().mapToInt(s->s.getSum()).sum();
		//==========================================================================================================================과목별 총합 구하기
		
		OptionalDouble korAvg = list.stream().mapToInt(s->s.getKor()).average();
		korAvg.ifPresent(avg -> System.out.println("국어 평균 : " + avg));//값이 있으면 내부 코드를 진행시키고 아닐경우 실행하지 않는다.(ifPresent)
		
		OptionalDouble engAvg = list.stream().mapToInt(s->s.getEng()).average();
		engAvg.ifPresent(avg -> System.out.println("영어 평균 : " + avg));
		
		OptionalDouble mathAvg = list.stream().mapToInt(s->s.getMath()).average();
		mathAvg.ifPresent(avg -> System.out.println("수학 평균 : " + avg));
		
		OptionalDouble totAvg = list.stream().mapToDouble(s->s.getAvg()).average();
		totAvg.ifPresent(avg-> System.out.println("모든점수의 평균 : "+ avg));
		//==========================================================================================================================과목별 평균값 구하기
		
		list.stream().forEach(c->{//리스트나 set이라서 사용 가능한 것이 stream임 배열을 스트림처럼 쓰고 싶으면 List처럼 변환 후 set으로 중복 제거하고 사용할 수 있음
			int sum = c.getSum();//내부에서 변수 선언하는건 가능한데 외부 변수를 내부에서 변경하는 것은 불가능함 
			double avg = c.getAvg();
			System.out.println("총점 : " + sum + " 평균 : "+avg);
		});
	}

}
