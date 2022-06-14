package week06;

import java.util.EmptyStackException;

public class ArrayStack<E> {
	private E s[];
	private int top;

	public ArrayStack() {
		s = (E[]) new Object[1];
		top = -1;
	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public E peek() {
		if (isEmpty())
			throw new EmptyStackException();
		return s[top];
	}

	public void push(E newItem) {
		if (size() == s.length)
			resize(2 * s.length);
		s[++top] = newItem;
	}

	public E pop() {
		if (isEmpty())
			throw new EmptyStackException();
		E item = s[top];
		s[top--] = null;
		if (size() > 0 && size() == s.length / 4)
			resize(s.length / 2);
		return item;
	}

	private void resize(int newSize) {
		Object[] t = new Object[newSize];
		for (int i = 0; i < size(); i++)
			t[i] = s[i];
		s = (E[]) t;
	}

	public void print() {
		// TODO Auto-generated method stub
		for (int i = 0; i < s.length; i++) {
			if (i < size())
				System.out.printf(s[i] + "\t");
			else
				System.out.printf("null\t");
		}
		System.out.println();
	}

	public boolean checkParentheses(String s) {

		ArrayStack a = new ArrayStack();
	
		for (int i = 0; i <= s.length()-1; i++) {	
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				a.push(s.charAt(i));
			} 
			else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
				
				if(a.size() == 0) {
					return false;
				}
				
				char r = (char) a.pop();
				
				if (r == '(') {
					if (s.charAt(i) == ')') 
						continue;
					else
						return false;
				} else if (s.charAt(i) == '}') {
					if (r == '{')
						continue;
					else
						return false;
				} else if (s.charAt(i) == ']') {
					if (r == '[')
						continue;
					else
						return false;
				} 
			}
			else
				continue;

		}if (isEmpty())
				return true;
			else
				return false;
	}

	public boolean checkPalindrome(String s) {
		ArrayStack a = new ArrayStack();
		if(s.length() == 1) 
			return true;
		if(s.length()%2 == 0) {
			for(int i = 0; i < s.length()/2; i++) {
				a.push(s.charAt(i));
			}
			for(int j = s.length()/2; j<s.length();j++) {
				char r = (char) a.pop();
				if(s.charAt(j) == r) 
					continue;
				else 
					return false;
			}
		}
		else {
			for(int i = 0; i < (s.length()-1)/2; i++) {
				a.push(s.charAt(i));
			}
			for(int j = (s.length()-1)/2+1; j<s.length()-1;j++) {
				char r = (char) a.pop();
				if(s.charAt(j) == r) 
					continue;
				else 
					return false;
			}
		}
		return true;
	}
}