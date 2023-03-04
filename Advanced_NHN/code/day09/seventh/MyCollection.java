package NGS.NHN.code.day09.seventh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollection<T extends Element> implements Iterable<T> {
	List<T> items;
	int lastIndex = 0;
	
	public MyCollection() {
		this.items = new ArrayList<T>();
	}
	
	public void add(T item) {
		this.items.add(item);
		lastIndex++;
	}
	
	public void remove(int count) {
		this.items.remove(count);
	}
	
	@Override
	public Iterator<T> iterator() {
		return this.items.iterator();
	}
	
	public List<T> getItems() {
		return this.items;
	}

}

abstract class Element implements Comparable<Element> {
	int number;
	String name;
	
	public Element(int number, String name) {
		this.number = number;
		this.name = name;
	}

	@Override
	public int compareTo(Element e) {
		if (number != e.number) {
			return number - e.number;
		} else {
			return name.compareTo(e.name);
		}
	}
	
	public int getNumber() {
		return this.number;
	}

	@Override
	public String toString() {
		return number + " / " + name;
	}
	
}

class Student extends Element {
	public Student(int number, String name) {
		super(number, name);
	}
}

class Utilities {
	public static void sort(MyCollection<Student> collection) {
		collection.getItems().sort((s, s2) -> (s.compareTo(s2)));
	}
}

class Test {
	public static void main(String[] args) {
		MyCollection<Student> collection = new MyCollection<Student>();
		 collection.add(new Student(6, "D"));
        collection.add(new Student(6, "C"));
        collection.add(new Student(6, "C"));
        collection.add(new Student(5, "Z"));
        collection.add(new Student(6, "A"));
        collection.add(new Student(1, "A"));
        collection.remove(2);
        
        for (Student s : collection) {
        	System.out.println(s);
        }
        
        Utilities.sort(collection);
        System.out.println("======================");
        
        for (Student s: collection) {
            System.out.println(s);
        }
        
	}
}









