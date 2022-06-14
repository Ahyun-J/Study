package week07;

public class Test extends ListQueue{
	ListQueue<Animal> dogs;
	ListQueue<Animal> cats;
	int order = 0;

	// == Constructor ==
	Test() {
		dogs = new ListQueue<>();
		cats = new ListQueue<>();
	}


	public void enter(Animal ani) {

	}

	public Animal adoptAny() {
	
		return null;
	}

	public Dog adoptDog() {
	
		return null;
	}

	public Cat adoptCat() {
		Cat out = cats.front();
		return null;
	}

	public void print() {

	}

}
