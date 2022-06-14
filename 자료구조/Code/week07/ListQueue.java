package week07;

import java.util.NoSuchElementException;

import week05.Node;

public class ListQueue <E>{
	protected Node<E> front, rear;
	private int size;
	public ListQueue() {
		front = rear = null;
		size = 0;
	}
	public int size() {return size;}
	public boolean isEmpty() {return size() == 0;}
	
	public Node<E> getRear() {
		return rear;
	}
	public void setRear(Node<E> rear) {
		this.rear = rear;
	}
	
	public void add(E newItem) {
		Node newNode = new Node(newItem, null);
		if(isEmpty()) front = newNode;
		else rear.setNext(newNode);
		rear = newNode;
		size++;
	}
	
	public E remove() {
		if(isEmpty()) throw new NoSuchElementException();
		E frontItem = front.getItem();
		front = front.getNext();
		if(isEmpty()) rear = null;
		size--;
		return frontItem;
	}
	
	public void print() {
		Node p = front;
		for (int i = 0; i < size; i++) {
			System.out.print(p.getItem() + "\t");
			p = p.getNext();
		}
		System.out.println();
	}
	
	public double avg() {
		int answer = 0;
		
		for (int i = 0; i < size; i++) {
			E r = this.remove();
			answer += (int) r;
			this.add(r);
		}
		return answer/size;
	}
	
	public void reverse() {
		
		
		int s = size;
		
		for (int i = 0; i < s  ; i++) {
			Node p = this.front;
			for(int j = 1; j < s-i; j ++)
				p = p.getNext();
			this.add( (E) p.getItem());
		}
		
		while(s != this.size) {
		for(int i = 0 ; i < size/2 ; i ++)
			this.remove();
		}
	}


	public Node<E> getFront() {
		return front;
	}
}
