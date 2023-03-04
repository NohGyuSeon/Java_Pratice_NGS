package NGS.NHN.test.second.list1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class LinkedList implements Iterable<Node> {
	// IteratorNode iterNode;
	// List<Node> items = new ArrayList<Node>();
	private Node thisNode;
	private Node head = null;
	private Node tail = null;
	private int size;

	LinkedList() {
	}

	public void add(Node newEntry) {
		if (head == null) {
			head = newEntry;
			tail = newEntry;
			size++;
			return;
		}

		thisNode = head;

		while (thisNode.hasNextNode()) {
			thisNode = thisNode.nextNode();
		}
		thisNode.next = newEntry;
		newEntry.prev = thisNode;
		tail = newEntry;
		size++;

		// tail.next = head;
		// head.prev = head;

		size++;
	}

	public void addAt(int position, Node node) {
		Node oldNode = getEntry(position);
		Node newNode = (node.next != null || node.prev != null) ? new Node(node.data) : node;
		if (position == 0) {
			newNode.next = oldNode;
			oldNode.prev = newNode;
			head = newNode;
		} else {
			// 기존의 노드의 왼쪽과 새로운 노드와 연결
			oldNode.prev.next = newNode;
			newNode.prev = oldNode.prev;
			// 새로운 노드의 오른쪽에 기존의 노드 연결
			newNode.next = oldNode;
			oldNode.prev = newNode;
		}
		size++;
	}

	public void remove(int position) {
		// position 인덱스의 Node를 삭제한다
		Node oldNode;
		if (position == 0) {
			head = head.next;
			head.prev = null;
		} else if (position == size - 1) {
			tail.prev.next = null;
			tail = tail.prev;
		} else {
			oldNode = getEntry(position);
			oldNode.prev.next = oldNode.next;
			oldNode.next.prev = oldNode.prev;
		}
		oldNode = null;
		size--;
	}

	public void clear() {
		// 모든 노드를 삭제한다
		head = tail = null;
	}

	public Node getEntry(int position) {
		// position 인덱스의 Node를 반환한다
		if (position >= size || position < 0) {
			throw new NoSuchElementException("반환할 Node가 없습니다!");
		} else if (position < size / 2) {
			// 앞에서부터 탐색
			thisNode = head;
			for (int i = 0; i < position; i++) {
				thisNode = thisNode.next;
			}
		} else {
			// 뒤에서부터 탐색
			thisNode = tail;
			for (int i = size - 1; i > position; i--) {
				thisNode = thisNode.prev;
			}
		}

		return thisNode;
	}

	public Node getEntry() {
		Node newTail = tail;
		remove(size - 1);
		return newTail;
	}

	public int size() {
		return this.size;
	}

	public void replace(int newPosition, Node newEntry) {
		getEntry(newPosition).data = newEntry.data;
		// this.addAt(newPosition, newEntry);
		// this.remove(newPosition+1);
	}

	public void sort() {
		// 노드 값을 기준으로 오름차순 정렬한다
		thisNode = head;
		Node[] nodeArray = new Node[size];
		for (int i = 0; i < size; i++) {
			nodeArray[i] = thisNode;
			thisNode = thisNode.next;
		}

		Arrays.sort(nodeArray, ((x, y) -> x.compareTo(y)));

		// 앞에서부터 뒤까지 연결
		for (int i = 0; i < size - 1; i++) {
			nodeArray[i].next = nodeArray[i + 1];
		}
		// 뒤에서부터 앞까지 연결
		for (int i = size - 1; i > 0; i--) {
			nodeArray[i].prev = nodeArray[i - 1];
		}

		head = nodeArray[0];
	}

	public void printAll() {
		if (this.head != null) {
			System.out.println(this.head.data);
			Node node = this.head;
			while (node.next != null) {
				node = node.next;
				System.out.println(node.data);
			}
		}
	}

	@Override
	public Iterator<Node> iterator() {
		return new IteratorNode(head);
	}
}

class Node<T extends Number> implements Comparable<Node> {
	T data;
	Node<T> prev = null;
	Node<T> next = null;

	public Node(T data) {
		this.data = data;
	}

	public boolean hasNextNode() {
		return this.next != null;
	}

	public Node<T> nextNode() {
		return this.next;
	}

	public boolean hasPrevNode() {
		return this.prev != null;
	}

	public Node<T> prevNode() {
		return this.prev;
	}

	@Override
	public int compareTo(Node o) {
		return (int) (this.data.doubleValue() - o.data.doubleValue());
	}
}

class IteratorNode implements Iterator {
	Node node = new Node(null);

	IteratorNode(Node node) {
		this.node.next = node;
	}

	@Override
	public boolean hasNext() {
		return node.hasNextNode();
	}

	@Override
	public Object next() {
		node = node.nextNode();
		return node;
	}
}

class Test {
	public static void main(String[] args) {
		// 테스트 코드

		Node<Integer> node = new Node<>(5);
		Node<Integer> node2 = new Node<>(10);
		Node<Float> node3 = new Node<>(2.5f);
		Node<Float> node4 = new Node<>(7.5f);
		Node<Double> node5 = new Node<>(4.55);
		Node<Double> node6 = new Node<>(3.55);
		Node<Long> node7 = new Node<>(50L);
		Node<Long> node8 = new Node<>(0L);

		LinkedList MyLinkedList = new LinkedList();
		MyLinkedList.add(node);
		MyLinkedList.add(node2);
		MyLinkedList.add(node3);
		MyLinkedList.add(node4);
		MyLinkedList.add(node5);
		MyLinkedList.add(node6);
		MyLinkedList.add(node7);
		MyLinkedList.add(node8);
		MyLinkedList.printAll();
		System.out.println("----------------");

		MyLinkedList.addAt(2, new Node<Double>(5.55));
		MyLinkedList.printAll();
		System.out.println("----------------");

		System.out.println(MyLinkedList.getEntry(2).data);
		System.out.println("----------------");

		MyLinkedList.remove(2);
		MyLinkedList.printAll();
		System.out.println("----------------");

		MyLinkedList.replace(0, new Node<Integer>(100));
		MyLinkedList.printAll();
		System.out.println("===========================");

		System.out.println("\n정렬 전 data 출력");
		for (Node nodes : MyLinkedList) {
			System.out.println(nodes.data);
		}

		MyLinkedList.sort();

		System.out.println("\n정렬 후 data 출력");
		for (Node nodes : MyLinkedList) {
			System.out.println(nodes.data);
		}
		
	}
}