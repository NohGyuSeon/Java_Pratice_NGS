package NGS.NHN.code.day09.third;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack<T extends StackNumber> implements Stackable<T>, Iterable<T> {
	public List<T> items;
	int lastIndex = 0;

	public Stack() {
		items = new ArrayList<T>(); 
	}

	public int getSize() {
		return items.size();
	}
	
	@Override
	public void push(T item) {
		items.add(item);
		lastIndex++;
	}

	@Override
	public T pop() {
		return this.items.remove(lastIndex);
	}
	
	@Override
	public Iterator<T> iterator() {
		return this.items.iterator();
	}
	
}


class Test {
	
	public static void main(String[] args) {
		  Stack<StackInteger> stack = new Stack<StackInteger>(); 
	        Stack<StackString> stack2 = new Stack<StackString>();

	        stack.push(new StackInteger(1));
	        stack.push(new StackInteger(2));
	        stack.push(new StackInteger(3));
	        // stack.pop();
	        // stack.pop();
	        // stack.pop();
	    
	        stack2.push(new StackString("NGS"));
	        stack2.push(new StackString("CMS"));
	        stack2.push(new StackString("HDH"));
	        // stack2.pop();
	        // stack2.pop(); 
	        // stack2.pop();

	        Iterator iter1 = stack.iterator();
	        Iterator iter2 = stack2.iterator();

	        while(iter1.hasNext()) {
	            System.out.println(iter1.next());
	        }
	        
	        while(iter2.hasNext()) {
	        	System.out.println(iter2.next());
	        }

	}
	
}
