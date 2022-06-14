package ani;

public class AniMain {

	public static void main(String[] args) {
		
		Shelter ani = new Shelter();
		
		int cnt = 1;
		
		Dog d1 = new Dog("Brad", cnt++);
		ani.enter(d1);
		System.out.println();
		
		Dog d2 = new Dog("Tom", cnt++);
		ani.enter(d2);
		System.out.println();
		
		Cat c1 = new Cat("Cindy", cnt++);
		ani.enter(c1);
		System.out.println();
		
		Dog d3 = new Dog("Jake", cnt++);
		ani.enter(d3);
		System.out.println();
		
		Cat c2 = new Cat("Jenny", cnt++);
		ani.enter(c2);
		System.out.println();
		
		Dog d4 = new Dog("Alex", cnt++);
		ani.enter(d4);
		System.out.println();
		
		Cat c3 = new Cat("Lucy", cnt++);
		ani.enter(c3);
		System.out.println();
		
		Cat c4 = new Cat("Maggie", cnt++);
		ani.enter(c4);
		System.out.println();
		
		ani.adoptAny(); ani.print();
		ani.adoptCat(); ani.print();
		ani.adoptDog(); ani.print();
		ani.adoptAny(); ani.print();
		ani.adoptDog(); ani.print();
		
	}
}

