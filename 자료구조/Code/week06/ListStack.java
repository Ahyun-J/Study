package week06;

import java.util.EmptyStackException;

import week05.DNode;
import week05.Node;

public class ListStack<E> {
	private Node<E> top;
	private int size;

	public ListStack() {
		top = null;
		size = 0;
	}

	public int size() {
		return size();
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E peek() {
		if (isEmpty())
			throw new EmptyStackException();
		return top.getItem();
	}

	public void push(E newItem) {
		Node newNode = new Node(newItem, top);
		top = newNode;
		size++;
	}

	public E pop() {
		if (isEmpty())
			throw new EmptyStackException();
		E topItem = top.getItem();
		top = top.getNext();
		size--;
		return topItem;
	}

	public void print() {
		Node p = top;
		for (int i = 0; i < size; i++) {
			System.out.printf(p.getItem() + "\t");
			p = p.getNext();
		}
		System.out.println();
	}

	public String getPostEq(String s) {
		ListStack a = new ListStack();
		String r = "";
		char t ;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				a.push(s.charAt(i));
			else if (s.charAt(i) == ')') {
				while (true) {
					t = (char) a.pop();
					if (t == '(')
						break;
					else {
						r += t;
						continue;
					}
				}

			} else if (s.charAt(i) == '*' || s.charAt(i) == '/') {
				while(a.size != 0) {
					t = (char) a.top.getItem();
					if( t == '-' || t == '+') {
						break;}
					else {
						r += a.pop();
						}
				}
				a.push(s.charAt(i));
				
			} else if (s.charAt(i) == '-' || s.charAt(i) == '+') {
					a.push(s.charAt(i));
			} else {
				r += s.charAt(i);
			}

		}
		if (a.size == 0) {

		} else {
			while (a.size != 0) {
				r += a.pop();
			}
		}
		return r;
	}
	
	public double calc (String[] s) {
		ListStack l = new ListStack();
		double d = 0;
		
		for(int i = 0; i<s.length; i++) {
			
			if(s[i] == "*" || s[i] == "/" || s[i] == "-" || s[i] == "+") {
				int a = Integer.parseInt(String.valueOf(l.pop()));
				int b = Integer.parseInt(String.valueOf(l.pop()));
				
				if(s[i] == "*") {
					int c = b*a;
					l.push(c);
				}
				else if(s[i] == "/") {
					int c = b/a;
					l.push(c);
				}
				else if(s[i] == "-") {
					int c = b-a;
					l.push(c);
				}
				else if(s[i] == "+") {
					int c = b+a;
					l.push(c);
				}
				
			}
			else {
				l.push(s[i]);
			}
		}
		while(l.size != 0) {
			d += Double.parseDouble(String.valueOf( l.pop()));
		}
		return d;
	}
}
