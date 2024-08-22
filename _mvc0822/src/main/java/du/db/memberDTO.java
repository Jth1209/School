package du.db;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class memberDTO {
	private String member_id;
	private String name;
	private String email;
	private String password;
	private String created_at;
	
	
}
