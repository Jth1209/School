package cart;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class cartpDTO {
	private int id;
	private int pid;
	private String name;
	private String description;
	private int price;
	private int stock;
	private int quantity;
}
