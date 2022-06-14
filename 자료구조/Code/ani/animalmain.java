package ani;

public class animalmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animalshelter ani = new animalshelter();
		int cnt = 1;
		
		Dog d1 = new Dog("Brad", cnt++);
		ani.enter(d1);
		
		Dog d2 = new Dog("Tom", cnt++);
		ani.enter(d2);
		
		Cat c1 = new Cat("Cindy", cnt++);
		ani.enter(c1);
		
		Dog d3 = new Dog("Jake", cnt++);
		ani.enter(d3);
		
		Cat c2 = new Cat("Jenny", cnt++);
		ani.enter(c2);
		
		Dog d4 = new Dog("Alex", cnt++);
		ani.enter(d4);
		
		Cat c3 = new Cat("Lucy", cnt++);
		ani.enter(c3);
		
		Cat c4 = new Cat("Maggie", cnt++);
		ani.enter(c4);
		
		ani.adoptAny(); ani.print();
		ani.adoptCat(); ani.print();
		ani.adoptDog(); ani.print();
		ani.adoptAny(); ani.print();
		ani.adoptDog(); ani.print();
		
	}

}
