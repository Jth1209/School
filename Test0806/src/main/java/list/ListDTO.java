package list;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class ListDTO {
	private int num;
	private String writer;
	private String title;
	private String regtime;
	private String content;
	private int hits;
}