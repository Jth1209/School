package Java0716;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Cat {
	private String breed;//품종
	private String color;
    private int age;
	
	public Cat() {System.out.println("Cat");}//default consturcter
	
	public Cat(String breed) {//consturcter
		this.breed = breed;
	}

//	public Cat(String breed, String color, int age) {
//		super();//this. super.
//		this.breed = breed;
//		this.color = color;
//		if(age > 9) {
//			this.age = age;
//		}else {
//			this.age = 10;
//		}
//	}
//
//	public Cat(String breed, String color) {
//		super();
//		this.breed = breed;
//		this.color = color;
//		this(breed,color,10);
//	}
    
}
