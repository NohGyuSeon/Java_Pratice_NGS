package NGS.NHN.code.day09.second;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lecture<T extends Person> implements Iterable<T> {
	public List<T> items;
	
	public Lecture() {
		this.items = new ArrayList<T>();
	}
	
	public int size() {
		return this.items.size();
	}
	 
	public void add(T item) {
		this.items.add(item);
	}

	@Override
	public Iterator<T> iterator() {
		return this.items.iterator();
	}
	
}
