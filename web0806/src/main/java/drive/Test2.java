package drive;

import java.util.List;

import dept.DeptDAO;
import dept.DeptDTO;

public class Test2 {

	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		DeptDTO dto = new DeptDTO(99,"웹개발부","서울");
		dao.insertDept(dto);
		System.out.println("입력 성공");
		

	}

}
