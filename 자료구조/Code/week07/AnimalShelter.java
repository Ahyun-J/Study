package week07;

import week05.Node;

public class AnimalShelter{
	ListQueue<Dog> dogs;
	ListQueue<Cat> cats;
	int count;

	public AnimalShelter() {
		super();
		this.count = 0;
		this.dogs = new ListQueue<Dog>();
		this.cats = new ListQueue<Cat>();
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
			int firstDogTime = this.dogs.getFront().getItem().getTimestamp();
			int firstCatTime = this.cats.getFront().getItem().getTimestamp();
			
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
		Node d = this.dogs.front;
		Node c = this.cats.front;
		Animal ani;
		int total = this.dogs.size() + this.cats.size();
		
		for(int i = 0; i<total ; i++) {
			if(d == null) {
				ani = (Animal) c.getItem();
				c = c.getNext();
			}
			else if(c == null) {
				ani = (Animal) d.getItem();
				d = d.getNext();
			}
			else {
				if(((Animal) d.getItem()).getTimestamp() <= ((Animal) c.getItem()).getTimestamp()) {
					ani = (Animal) d.getItem();
					d = d.getNext();
				} else {
					ani = (Animal) c.getItem();
					c = c.getNext();
				}
			}
			if( i < total-1) System.out.printf("%s (%s) - ", ani.name, ani.type);
			else System.out.printf("%s (%s)\n", ani.name, ani.type);
		}
	}
}
