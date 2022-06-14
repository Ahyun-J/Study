package ani;

import java.util.LinkedList;
import java.util.Queue;

public class animalshelter {
	Queue<Dog> dogs;
	Queue<Cat> cats;
	int count;

	// == Constructor ==
	public animalshelter() {
		super();
		this.count = 0;
		dogs = new LinkedList<>();
        cats = new LinkedList<>();
	}

	public void enter(Cat c) {
		System.out.printf("* Neq animal arrived: ");
		c.speak();
		cats.add(c);
	}

	public void enter(Dog d) {
		System.out.printf("* Neq animal arrived: ");
		d.speak();
		dogs.add(d);
	}

	public void adoptAny() {
		if(this.dogs.size() == 0 && cats.size() == 0) System.out.println("null");
		else if(this.dogs.size() <= 0 ) this.adoptCat();
		else if(this.cats.size() <= 0 ) this.adoptDog();
		else {
			int firstDogTime = this.dogs.peek().getTimestamp();
			int firstCatTime = this.cats.peek().getTimestamp();
			
			if(firstDogTime <= firstCatTime ) this.adoptDog();
			else this.adoptCat();
		}
	}

	public void adoptDog() {
		Dog d = this.dogs.remove();
		System.out.printf("Adoping dog (name : %s)\n", d.getName());
	}

	public void adoptCat() {
		Cat c = this.cats.remove();
		System.out.printf("Adoping cat (name : %s)\n", c.getName());
	}

	public void print() {
		Queue<Dog> d = (Queue<Dog>) this.dogs.peek();
		Queue<Cat> c = (Queue<Cat>) this.cats.peek();
		animal ani;
		int total = this.dogs.size() + this.cats.size();
		
		for(int i = 0; i<total ; i++) {
			if(d == null) {
				ani = c.peek();
				c = c.getNext();
			}
			else if(c == null) {
				ani = d.peek();
				d = d.getNext();
			}
			else {
				if(d.peek().getTimestamp() <= c.peek().getTimestamp()) {
					ani = d.peek();
					d = d.getNext();
				} else {
					ani = c.peek();
					c = c.getNext();
				}
			}
			if( i < total-1) System.out.printf("%s (%s) - ", ani.name, ani.type);
			else System.out.printf("%s (%s)\n", ani.name, ani.type);
		}
	}
}
