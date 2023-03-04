package NGS.NHN.code.day09.second;

public class Person {
	private String name;
	private int number;
	private String department;
	
	public Person(String name, int number, String department) {
		this.name = name;
		this.number = number;
		this.department = department;
	}

	@Override
	public String toString() {
		return name + ", " + number + ", " + department;
	}

	
}
