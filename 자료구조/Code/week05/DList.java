package week05;

import java.util.NoSuchElementException;

import week04.ArrListPoly;

public class DList<E> {
	protected DNode head, tail;
	protected int size;

	public DList() {
		head = new DNode(null, null, null);
		tail = new DNode(null, head, null);
		head.setNext(tail);
		size = 0;
	}

	public void insertBefore(DNode p, E newItem) {
		DNode t = p.getPrevious();
		DNode newNode = new DNode(newItem, t, p);
		p.setPrevious(newNode);
		t.setNext(newNode);
		size++;
	}

	public void insertAfter(DNode p, E newItem) {
		DNode t = p.getNext();
		DNode newNode = new DNode(newItem, p, t);
		t.setPrevious(newNode);
		p.setNext(newNode);
		size++;
	}

	public void delete(DNode x) {
		if (x == null)
			throw new NoSuchElementException();
		if (size <= 0)
			throw new NoSuchElementException();
		DNode f = x.getPrevious();
		DNode r = x.getNext();
		f.setNext(r);
		r.setPrevious(f);
		size--;
	}

	public void print() {
		DNode p = head.getNext();
		DNode t = tail;

		if (p == t)
			System.out.println("리스트 비어있음");

		for (int i = 0; i < size; i++) {
			System.out.print(p.getItem() + " ");
			p = p.getNext();
		}
		System.out.println();
	}

	public int size() {
		return this.size;
	}

	public int add(DList dl2) {
		// d1 + d2
		DNode p = this.tail.getPrevious();
		DNode q = dl2.tail.getPrevious();

		int carry = 0; int remainder = 0; 
		int result = 0; 
		int m_size = Math.max(this.size, dl2.size);
		
		int d1_curr = (int) p.getItem();
		int d2_curr = (int) q.getItem();

		// while/for : tail ~ head
		for (int i = 1; i < m_size+1; i++) {
			int sum = 0;
			
			if (p.getItem() == null) {
				d1_curr = 0;
			}else {
				d1_curr = (int) p.getItem();
			}
			if (q.getItem() == null) {
				d2_curr = 0;
			}else {
				d2_curr = (int) q.getItem();
			}

			sum = d1_curr + d2_curr + carry;
		
			if (sum >= 10) {
				carry = (int) Math.floor(sum/10);
				remainder = sum % 10;
			}else {
				carry = 0;
			}
			p = p.getPrevious();
			q = q.getPrevious();

			switch (i) {
			case 1:
				if(sum >= 10) {
					result += remainder * 1;
					break;
				}
				result += sum * 1;
				break;
			case 2:
				if(sum >= 10) {
					result += remainder * 10;
					break;
				}
				result += sum * 10;
				break;
			case 3:
				if(sum >= 10) {
					result += remainder * 100;
					break;
				}
				result += sum * 100;
				break;
			case 4:
				if(sum >= 10) {
					result += remainder * 1000;
					break;
				}
				result += sum * 1000;
				break;
			case 5:
				if(sum >= 10) {
					result += remainder * 10000;
					break;
				}
				result += sum * 10000;
				break;
			}
		}
		return result;
	}
}
