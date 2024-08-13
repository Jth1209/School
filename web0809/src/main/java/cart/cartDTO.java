package cart;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString

public class cartDTO {
	private int id;
	private int product_id;
	private int quantity;
}
