package drive;

import java.util.List;

import dept.DeptDAO;
import dept.DeptDTO;

public class Test {

	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		List<DeptDTO> dto = dao.getDeptList();
		for(DeptDTO dt : dto) {
			System.out.println(dt);
		}

	}

}
