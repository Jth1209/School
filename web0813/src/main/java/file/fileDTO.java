package file;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class fileDTO {
	private int num;
	private String fname;
	private String ftime;
	private int fsize;
}
