package week05;

public class DNode <E> {
	private E item;
	private DNode previous;
	private DNode next;
	public DNode(E newItem, DNode p, DNode q) {
		item = newItem;
		previous = p;
		next = q;
	}
	public E getItem() {
		return item;
	}
	public void setItem(E newItem) {
		item = newItem;
	}
	public DNode getPrevious() {
		return previous;
	}
	public void setPrevious(DNode p) {
		previous = p;
	}
	public DNode getNext() {
		return next;
	}
	public void setNext(DNode q) {
		next = q;
	}
	
}
