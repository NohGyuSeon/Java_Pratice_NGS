package NGS.NHN.code.day09.first;

import java.util.Iterator;

public class Lecture implements Iterable {
	Student student[];
	
	public Lecture(int size) {
		this.student = new Student[size];
	}
	
	public int size() {
		return this.student.length;
	}
	
	@Override
	public Iterator iterator() {
		return new LectureIterator(this);
	}
	
}
