package NGS.NHN.test.second.list3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedList<T extends Number> implements Iterable<Node> {
	IteratorNode iterNode;
    List<Node> items = new ArrayList<Node>();
    int size = 0;
    
	public Node<T> head = null;
	public Node<T> tail = null;
	
	public LinkedList() {
		iterNode = new IteratorNode();
	}


	@Override
	public Iterator<Node> iterator() {
		return new IteratorNode();
	}

	class IteratorNode implements Iterator<Node> {
		private Node lastReturned;
        private Node next;
        private int nextIndex;

        IteratorNode() { 
            next = head;
            nextIndex = 0;
        }

		@Override
        public Node next() { 
            lastReturned = next;
            next = next.next;
            ++nextIndex;
            return lastReturned;
        }

		@Override
        public boolean hasNext() {
            return nextIndex < size();
        }

		// Node x = head;

		// @Override
		// public boolean hasNext() {
		// 	return head != null;
		// }
 
		// @Override
		// public Node next() {
		// 	Node tmp = x;
		// 	x = x.next;

		// 	return tmp;
		// }

	}

	public void add(T newEntry) {
		if (this.head == null) {
			this.head = new Node<T>(newEntry); 
			this.tail = this.head; 
		} else { 
			Node<T> node = this.head; 
			while ( node.next != null) { 
				node = node.next; 
			}
			node.next = new Node<T>(newEntry); 
			node.next.prev = node; 
			this.tail = node.next;
		}

        size++;
	}

	// public void addAt(int position, T newEntry) {
	// 	int curIndex = size;

	// 	if (position == 0) {
	// 		Node newNode = new Node<T>(newEntry);
	// 		newNode.next = head;
	// 		head.prev = newNode;
	// 	} else if (position == size-1) {
	// 		Node newNode = new Node<T>(newEntry);
	// 		tail.next = newNode;
	// 		newNode.prev = tail;
	// 	} else if (curIndex / 2 > position) {
	// 		curIndex = 0;
	// 		Node x = head;
		
	// 		while(curIndex < position) {
	// 			x = x.next;
	// 			curIndex++;
	// 		}

	// 		Node newNode = new Node<T>(newEntry);

	// 		x.prev.next = newNode;
	// 		x.next.prev = newNode;

	// 		newNode.prev = x.prev;
	// 		newNode.next = x;

	// 	} else {
	// 		curIndex = size-1;
	// 		Node x = tail;
		
	// 		while(curIndex != position) {
	// 			x = x.prev;
	// 			curIndex--;
	// 		}

	// 		Node newNode = new Node<T>(newEntry);

	// 		x.prev.next = newNode;
	// 		x.next.prev = newNode;

	// 		newNode.prev = x.prev;
	// 		newNode.next = x;
	// 	}

	// 	size++;
	// }
	
    public void addFirst(Number input) {
        Node newNode = new Node(input);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        ++size;
        if (head.next == null) {
            tail = head;
        }
    }

    public void addLast(Number input) {
        Node newNode = new Node(input);
        if (size == 0) {
            addFirst(input);
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            ++size;
        }
    }

    Node node(int index) {
        if (index < size / 2) {
            Node x = head;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
            return x;
        } else {
            Node x = tail;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            return x;
        }
    }

    public void addAt(int index, Number input) {
        if (index == 0) {
            addFirst(input);
        } else {
            Node temp1 = node(index - 1);
            Node temp2 = temp1.next;
            Node newNode = new Node(input);

            temp1.next = newNode;
            newNode.next = temp2;
            if (temp2 != null) {
                temp2.prev = newNode;
            }
            newNode.prev = temp1;
            ++size;
            if (newNode.next == null) {
                tail = newNode;
            }
        }
    }
	
	public void printAll() {
		if (this.head != null) { 
			System.out.println(this.head.data);
			Node<T> node = this.head; 
			while(node.next != null) { 
				node = node.next; 
				System.out.println(node.data); 
			}
		} 
	}
	
    public void clear() {
        for (Node<T> value = head; value != null;) {
            Node<T> nextNode = value.next;
            value.data = null;
            value.next = null;
            value.prev = null;
            value = nextNode;
        }
        head = tail = null;
        size = 0;
    }

	public int size() {
        return size;
    }

	public Node getEntry(int position) {
		int curIndex = size;
		if (position == 0) {
			return head;
		} else if (position == size-1) {
			return tail;
		} else if (curIndex / 2 > position) {
			curIndex = 0;
			Node x = head;
		
			while(curIndex < position) {
				x = x.next;
				curIndex++;
			}

			return x;
		} else {
			curIndex = size-1;
			Node x = tail;
		
			while(curIndex != position) {
				x = x.prev;
				curIndex--;
			}

			return x;
		}
	}
	
	public Node getEntry() {
		Node temp = tail;
		Node temp2 = tail.prev;

		tail.prev = null;
		tail.data = null;
		
		temp2.next = null;
		tail = temp2;

		return temp;
	}

	public void remove(int position) {
		Node oldNode = getEntry(position);

		if(position == 0) {
			head.next.prev = null;
			head = head.next;	
		} else if(position == size-1) {
			tail.prev.next = null;
			tail = tail.prev;
		} else {
			oldNode.prev.next = oldNode.next;
			oldNode.next.prev = oldNode.prev;
	
			oldNode = null;
		}

		--size;
	}

	public void replace(int newPosition, T newEntry) {
		this.addAt(newPosition, newEntry);
		this.remove(newPosition+1);		
	}

	public void sort() {
		for (int i = 0; i < size; i++) {
			items.add(getEntry(i));	
		}

		items.sort((x, y) -> x.compareTo(y));

		Node x = new Node(items.get(0).data);
		  
		// for (int i = 0; i < size-1; i++) {
		// 	x.next = new Node(items.get(i+1).data);
		// 	x = x.next;
		// }

		// for (int i = size-1; i > 0; i--) { 
		// 	x = items.get(i-1);
		// 	x = x.prev;
		// }
 
		head = x;
	}

	public static void main(String[] args) {
		// 테스트 코드
		
		LinkedList<Integer> MyLinkedList = new LinkedList<Integer>();

        MyLinkedList.add(1);
        MyLinkedList.add(10);
        MyLinkedList.add(5);
        MyLinkedList.add(2);
        MyLinkedList.add(3);
        MyLinkedList.printAll();
        System.out.println("----------------");

		MyLinkedList.addAt(3, 50);
        MyLinkedList.printAll();
		System.out.println("----------------");

		System.out.println(MyLinkedList.getEntry(2).data);
		System.out.println("----------------");

		MyLinkedList.remove(2);
        MyLinkedList.printAll();
		System.out.println("----------------");

		MyLinkedList.replace(2, 1000);
        MyLinkedList.printAll();
		System.out.println("----------------");

	
		for (Node node : MyLinkedList) {
			System.out.println(node.data);	
		}
		
		MyLinkedList.sort();
		System.out.println("####################");
        MyLinkedList.printAll();
		System.out.println("----------------");

		// Iterator iter = MyLinkedList.iterator();
		// for (Node node : MyLinkedList.items) {
		// 	System.out.println(iter.next());
		// 	System.out.println(node.next);
		// }
	
	}
}

class Node<T extends Number> implements Comparable<Node> {
	T data;
	Node<T> prev = null;
	Node<T> next = null;
	
	public Node(T data){
		this.data = data;
	}

	@Override
	public int compareTo(Node o) {
		return this.data.intValue() - o.data.intValue();
	}
}