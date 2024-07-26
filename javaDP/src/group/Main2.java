package group;

import java.util.Iterator;

public class Main2 {

	public static void main(String[] args) {
		StudentInfo st = new StudentInfo(4);
		st.appendstudent(new Student("김하나","1906001",3.5));
		st.appendstudent(new Student("강하나","1906002",3.6));
		st.appendstudent(new Student("최하나","1906003",3.8));
		st.appendstudent(new Student("이하나","1906004",4.5));
		
		Iterator<Student> it = st.iterator();
		while(it.hasNext()) {
			Student stu = it.next();
			System.out.println(stu);
		}
		System.out.println();
		for(Student stu: st) {
			System.out.println(stu);
		}
		System.out.println();
	}

}
