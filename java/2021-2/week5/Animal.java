package week5;

public abstract class Animal {
	
	public String name;

		public String reaction(Animal animal) {
			
			//Animal cat = new Animal();
			
			String ani = null; //들어가야 하는 이유?
	
			if (animal instanceof Dog) {
				 ani = "강아지_꼬리올리고 ";
				 Dog dog = (Dog)animal;
				//System.out.println("강아지_꼬리올리고");
				//reaction = "강아지_꼬리올리고";
			}
			if  (animal instanceof Cat) {
				 ani = "고양이_꼬리내리고 ";
				 Cat cat = (Cat)animal;
				//System.out.println("고양이_꼬리내리고");
				//reaction = "고양이_꼬리내리고";
			}
			return ani;
			
			
		}

		public abstract void sound();

		

//	private static void animalSound(Dog dog) {
//			// TODO Auto-generated method stub	
//		}
//	
//	private static void animalSound(Cat cat) {
//		// TODO Auto-generated method stub	
//	}


//	public String reaction(Animal ani) {
//		//Animal ani = null;
//		
//		ani = new Dog();
//		ani = new Cat();
//		
//		//return null;
//		
//	}
		
//			Animal ani = null;
//			ani = new Dog();
//			ani = new Cat();

}
