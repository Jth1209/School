package java0730;

public class Student {
	private String name;
	private Integer score;
	private int index = 0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Student(String name, Integer score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public int getIndex(){
		index ++;
		return index;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	
	
}