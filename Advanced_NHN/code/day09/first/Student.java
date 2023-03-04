package NGS.NHN.code.day09.first;

public class Student {
	int number;
	String name;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}

	@Override
	public String toString() {
		return this.number + ", " + this.name;
	}
	
}
