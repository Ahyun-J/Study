package week3;

public class PhoneTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone [] p = {
				new Phone(),
				new Phone("SAM",100),
				new SmartPhone(),
				new SmartPhone("LG",50,true)
				,new SmartPhone()
		};
		
	for(int i = 0; i<p.length ;i++) {	
		System.out.println(p[i]);
		}

	}
}
