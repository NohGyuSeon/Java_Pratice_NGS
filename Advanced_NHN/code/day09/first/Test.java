package NGS.NHN.code.day09.first;

public class Test {
	public static void main(String[] args) {
		Lecture lecture = new Lecture(3);
		lecture.student[0] = new Student(1, "NGS");
		lecture.student[1] = new Student(2, "a");
		lecture.student[2] = new Student(3, "b");
		
		for (Object s : lecture) {
			System.out.println(s);
		}
		
		System.out.println("=============================");
		
		LectureIterator lectureIterator = new LectureIterator(lecture);

		for (Object s : lecture) {
			if (lectureIterator.hasNext()) {
				System.out.println(lectureIterator.next());
			}
		}
		
		System.out.println("=============================");
		
		int i = lecture.size()-1;
		for(; i >= 0; i--) {
			System.out.println(lecture.student[i]);
		}
		
	}
}
