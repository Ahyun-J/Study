package week06;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack<String> str = new ArrayStack<String>();
		ListStack<String> s = new ListStack<String>();
		
		String str1, str2, str3, str4, str5  = new String();
		
//		String [] s1 = {"8", "37", "13", "+", "40", "-", "*"};
//		String[] s2 = {"20", "-10", "3", "+", "*"};
//		String [] s3 = {"1", "2","+"};
//		
//		System.out.print("[Task 1] ");
//		for(int i = 0; i <s1.length ;i++) {
//		System.out.print(s1[i] + " ");}
//		System.out.println(" : " + s.calc(s1));
//		
//		System.out.print("[Task 2] ");
//		for(int i = 0; i <s2.length ;i++) {
//		System.out.print(s2[i] + " ");}
//		System.out.println(" : " + s.calc(s2));
		
		
//		str1 = "A*(B+C/D)";
//		str2 = "(A+B)*(C-D)";
//		
//		System.out.println("[Task 1] "+str1 +" : "+s.getPostEq(str1));
//		System.out.println("[Task 2] "+str2 +" : "+s.getPostEq(str2));
		
		
//		str1 = "redivider";
//		str2 = "redder";
//		str3 = "a";
//		str4 = "abbd";
//		str5 = "abcde";
//		
//		System.out.println(str1+ " : " + ((str.checkPalindrome(str1))?"True" : "False"));
//		System.out.println(str2+ " : " + ((str.checkPalindrome(str2))?"True" : "False"));
//		System.out.println(str3+ " : " + ((str.checkPalindrome(str3))?"True" : "False"));
//		System.out.println(str4+ " : " + ((str.checkPalindrome(str4))?"True" : "False"));
//		System.out.println(str5+ " : " + ((str.checkPalindrome(str5))?"True" : "False"));
	
	
		str1 = "(ant+bee)*crab+{[ant*food]+(offset)}/gas";
		System.out.println("[Task 1]"+str1 + ": " 
		+ ((str.checkParentheses(str1))?"True" : "False"));
		
		if(str.checkParentheses(str1) == true)
			System.out.println("str1 수식에는 모든 괄호 짝이 맞습니다.");
		else
			System.out.println("str1 수식에는 짝이 맞지 않는 괄호가 있습니다.");
		
		
		str2 = "(ant+bee)*crab+[ant*food]+(offset)}/gas";
		System.out.println("[Task 2]"+str2 + ": " 
		+ ((str.checkParentheses(str2))?"True" : "False"));
		
		if(str.checkParentheses(str2) == true)
			System.out.println("str2 수식에는 모든 괄호 짝이 맞습니다.");
		else
			System.out.println("str2 수식에는 짝이 맞지 않는 괄호가 있습니다.");
	}

}
