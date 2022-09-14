package week9;

//public class NotExistIDException extends Exception {
//	public NotExistIDException() {}
//	public NotExistIDException(String message) {
//		super(message);
//	}
//}
//
//public class WrongPasswordException extends Exception{
//	public WrongPasswordException() {}
//	public WrongPasswordException(String message) {
//		super(message);
//	}
//}

public class LoginExample {
	 public static void main(String[] args) {

		    try {

		      login("white", 12345);

		    } catch(Exception e) {

		      System.out.println(e.getMessage());

		    }

		 

		    try {

		      login("blue", 54321);

		    } catch(Exception e) {

		      System.out.println(e.getMessage());

		    }
		    finally {
		    	System.out.println("20215247_조아현");
		    }

		  }

		 

		  public static void login(String id, int password) 
				  throws NotExistIDException, WrongPasswordException{

		    if(id != "blue"){
		    	throw new NotExistIDException("아이디가 맞지 않습니다.");
		    	//id가 blue가 아니라면 NotExistIDException 발생시킴
		    }

		    //~~~~~

		    if(password != 12345){
		    	throw new WrongPasswordException("비밀번호가 맞지 않습니다.");
		    	//password가 12345가 아니라면 WrongPasswordException 발생시킴
		    }

		    //~~~~
		   
		  }

		


}
