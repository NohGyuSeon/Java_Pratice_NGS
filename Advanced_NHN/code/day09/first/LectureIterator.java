package NGS.NHN.code.day09.first;

import java.util.Iterator;

public class LectureIterator implements Iterator {
	Lecture lecture;
	int index = 0;
	
	public LectureIterator(Lecture lecture) {
		this.lecture = lecture;
	}
	
	@Override
	public boolean hasNext() {
		if (index < lecture.size()) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public Object next() {
		return lecture.student[index++];
	}

}
