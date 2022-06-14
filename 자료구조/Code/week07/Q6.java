package week07;

import java.util.LinkedList;
import java.util.Queue;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnimalQueue ani = new AnimalQueue();
		Dog d1 = new Dog("Brad");
		ani.enqueue(d1);
		
		Dog d2 = new Dog("Tom");
		ani.enqueue(d2);
		
		Cat c1 = new Cat("Cindy");
		ani.enqueue(c1);
		
		Dog d3 = new Dog("Jake");
		ani.enqueue(d3);
		
		Cat c2 = new Cat("Jenny");
		ani.enqueue(c2);
		
		Dog d4 = new Dog("Alex");
		ani.enqueue(d4);
		
		Cat c3 = new Cat("Lucy");
		ani.enqueue(c3);
		
		Cat c4 = new Cat("Maggie");
		ani.enqueue(c4);
		
		ani.dequeueAny(); ani.print();
		ani.dequeueCat(); ani.print();
		ani.dequeueDog(); ani.print();
		ani.dequeueAny(); ani.print();
		ani.dequeueDog(); ani.print();
    }

    /* Animal Model */
    static class Animal {
        String name;
        int order;
        public Animal(String name) {
            this.name = name;
        }
 
    	String type;
    	int time;

    	public Animal(String n, int cnt, String ani) {
    		this.name = n;
    		this.time = cnt;
    		this.type = ani;
    	}
    	
        public void setOrder(int order) {
            this.order = order;
        }
    }

    /* Dog Model */
    static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }
        
    	public Dog(String name, int cnt) {
    		super(name, cnt, "Dog");
    	}
    }

    /* Cat Model */
    static class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }
        
    	public Cat(String name, int cnt) {
    		super(name, cnt, "Cat");
    	}
    }

    /* 동물보호소 */
    static class AnimalQueue {

        // == Field ==
        Queue<Animal> dogs;
        Queue<Animal> cats;
        int order = 0;

        // == Constructor ==
        public AnimalQueue() {
            dogs = new LinkedList<>();
            cats = new LinkedList<>();
        }

        // == enqueue - dog ==
        public void enqueue(Animal animal) {
            animal.setOrder(order++);
            if(animal instanceof Dog) dogs.add(animal);
            else cats.add(animal);
        }

        // == dequeueAny - order ==
        public Animal dequeueAny() {
            if(dogs.size() == 0 && cats.size() != 0) {
                return cats.remove();
            }
            else if(dogs.size() != 0 && cats.size() == 0) {
                return dogs.remove();
            }
            else if(dogs.size() != 0 && cats.size() != 0) {
                if(dogs.peek().order > cats.peek().order) {
                    return dogs.remove();
                } else {
                    return cats.remove();
                }
            }
            return null;
        }

        // == dequeueDog ==
        public Dog dequeueDog() {
            if(dogs.size() > 0) {
                return (Dog) dogs.remove();
            }
            return null;
        }

        // == dequeueCat ==
        public Cat dequeueCat() {
            if(cats.size() > 0) {
                return (Cat) cats.remove();
            }
            return null;
        }
        
        public void print() {
    		Queue<Dog> d = this.dogs.getFront();
    		Queue<Cat> c = this.cats.getFront();
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
}
