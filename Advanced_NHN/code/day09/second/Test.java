package NGS.NHN.code.day09.second;

import java.util.Iterator;

public class Test {
	
	public static void main(String[] args) {
		Lecture<Student> lecture = new Lecture<Student>();
//		Lecture<SpaceRanger> lecture2 = new Lecture<SpaceRanger>();
		
		lecture.add(new Student("NGS", 1, "NHN"));
		lecture.add(new Student("Dragon", 150, "Protos"));
		lecture.add(new Student("Lava", 10, "Zeg"));
		
		Iterator iter = lecture.iterator();
		
		for (Student student : lecture) {
			System.out.println(student.toString());
		}
		
		
	}
}
