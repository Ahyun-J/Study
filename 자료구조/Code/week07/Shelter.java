package week07;

public class Shelter {
	ListQueue<Dog> dogs;
	ListQueue<Cat> cats;
	int order;

	// == Constructor ==
	Shelter() {
		super();
		this.order = 0;
		dogs = new ListQueue<Dog>();
		cats = new ListQueue<Cat>();
	}

	public void enter(Animal ani) {
		ani.setOrder(order++);
		if (ani instanceof Dog)
			dogs.add((Dog) ani);
		else
			cats.add((Cat) ani);
	}

	public Animal adoptAny() {
		if (dogs.size() == 0 && cats.size() != 0) {
			return cats.remove();
		} else if (dogs.size() != 0 && cats.size() == 0) {
			return dogs.remove();
		} else if (dogs.size() != 0 && cats.size() != 0) {
			if (dogs.getFront().getItem().getTime() > cats.getFront().getItem().getTime()) {
				return dogs.remove();
			} else {
				return cats.remove();
			}
		}
		return null;
	}

	public Dog adoptDog() {
		if (dogs.size() > 0) {
			return (Dog) dogs.remove();
		}
		return null;
	}

	public Cat adoptCat() {
		if (cats.size() > 0) {
			return (Cat) cats.remove();
		}
		return null;
	}

	public void print() {
		ListQueue<Dog> d = this.dogs.getFront();
		ListQueue<Cat> c = this.cats.getFront();
		Animal ani;
		int total = this.dogs.size() + this.cats.size();
		
		for(int i = 0; i<total ; i++) {
			if(d == null) {
				ani = c.getItem();
				c = c.getNext();
			}
			else if(c == null) {
				ani = d.getItem();
				d = d.getNext();
			}
			else {
				if(d.getItem().getTime() <= c.getItem().getTime()) {
					ani = d.getItem();
					d = d.getNext();
				} else {
					ani = c.getItem();
					c = c.getNext();
				}
			}
			if( i < total-1) System.out.printf("%s (%s) - ", ani.name, ani.type);
			else System.out.printf("%s (%s)\n", ani.name, ani.type);
		}
	}
}
