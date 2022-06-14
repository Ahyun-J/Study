package week05;

import java.util.Arrays;
import java.util.NoSuchElementException;

import week04.ArrListPoly;

public class SList<E> {
	protected Node head;
	private int size;

	public SList() {
		head = null;
		size = 0;
	}

	public int search(E target) {
		Node p = head;
		for (int k = 0; k < size; k++) {
			if (target == p.getItem())
				return k;
			p = p.getNext();
		}
		return -1;
	}

	public void insertFront(E newItem) {
		head = new Node(newItem, head);
		size++;
	}

	public void insertAfter(E newItem, Node p) {
		p.setNext(new Node(newItem, p.getNext()));
		size++;
	}

	public void deleteFront() {
		if (size == 0)
			throw new NoSuchElementException();
		head = head.getNext();
		size--;
	}

	public void deleteAfter(Node p) {
		if (p == null)
			throw new NoSuchElementException();
		Node t = p.getNext();
		if (t != null) {
			p.setNext(t.getNext());
			t.setNext(null);
			size--;
		} else
			;
	}

	public void print() {
		Node p = head;
		for (int i = 0; i < size; i++) {
			System.out.print(p.getItem() + " ");
			p = p.getNext();
		}
	}

	public int size() {
		return this.size;
	}

	public void insertFront(int newItem) {
		head = new Node(newItem, head);
		size++;
	}

	public void insertAfter(int newItem, Node p) {
		p.setNext(new Node(newItem, p.getNext()));
		size++;
	}

	public void setAndOrderNodes(int[] arr) {
		this.insertFront((int) arr[0]);
		for (int i = 0; i < size; i++) {
			if (arr != null) 
				this.deleteAfter(head);
			else
				return;}

		for (int i = 1; i < arr.length; i++) {
			Node p = head;
			Node q = p.getNext();

			int p_n = (int) p.getItem();
			if (arr[i] <= p_n)
				this.insertFront(arr[i]);
			else {
				while (true) {
					assert (p != null);

					if (q == null) {
						this.insertAfter(arr[i], p);
						break;
					}

					p_n = (int) p.getItem();
					int next_n = (int) q.getItem();

					assert (arr[i] > p_n);

					if (arr[i] <= next_n && arr[i] > p_n) {
						this.insertAfter(arr[i], p);
						break;
					} else {
						p = p.getNext();
						q = q.getNext();
					}

				}
			}
		}
	}

	public void join(SList slist2) {

		int l = (slist2.size + this.size);
		int[] arr = new int[l];

		Node q = this.head;
		for (int i = 0; i < this.size(); i++) {
			arr[i] = (int) q.getItem();
			q = q.getNext();
		}

		Node p = slist2.head;
		for (int i = this.size(); i < l; i++) {
			arr[i] = (int) p.getItem();
			p = p.getNext();
		}

		for (int i = 0; i <= this.size; i++) {
			if (this != null) {
				this.deleteFront();
			} 
		}

		setAndOrderNodes(arr);
	}

	public void reverse() {
		Node p = head;
		Node q = null;
		Node r = null;

		for (int i = 0; i < size; i++) {
			r = q;
			q = p;
			p = p.getNext();
			q.setNext(r);
		}
		head = q;
	}

}
