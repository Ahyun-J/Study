package week11;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
	
		int a =Integer.parseInt(args[0]);
		int b =Integer.parseInt(args[2]);
		
		

	}
}

//13
//	Scanner sc = new Scanner(System.in);
//	
//	String a = "secret";
//	
//	StringBuffer sb = new StringBuffer(a);
//	
//	for(int i = a.length()-1; i >=0 ; i--) {
//	System.out.print(a.charAt(i));
//	}
//	
//	//sb.reverse();
//	System.out.println("\n"+sb.reverse());

//15
////	Integer obj = args
////	int sum += obj;
//	
//	int sum = 0;
//		
//	for(int i = 0; i<args.length;i++) {
//	int a =Integer.parseInt(args[i]);
//	System.out.println(a);
//	sum += a;
//		}
//	
//	System.out.println("합은 = "+sum);
//	
//	sum = 0;
//	
//	for(int i = 0; i<args.length;i++) {
//	if(Pattern.matches("^[0-9]*$", args[i])==true) {
//		sum += Integer.parseInt(args[i]);
//		}
//	}
//	System.out.println("합은 = "+sum);

//17
//		int a =0;
//		
//		Random random = new Random();
//		
//		for(int i = 0 ; i<5;i++) {
//			 a = random.nextInt(6)+1;
//			 System.out.println("현재 주사위 : "+a);
//		}

//19
//	for(int i = 0 ; i<args.length;i++) {
//		System.out.println("args[" + i + "]=" 
//	+ args[i]);
//		}
//
//	String [] tmp = new String[args.length];
//	tmp = Arrays.copyOf(args, args.length);
//	
//	System.out.println("\n== Before Sort (array tmp) ==");
//	
//	for(int i = 0 ; i<tmp.length;i++) {
//		System.out.println(tmp[i]);
//		}
//	
//	Arrays.sort(tmp);
//	
//	System.out.println("\n== After Sort (array tmp) ==");
//	
//	for(int i = 0 ; i<tmp.length;i++) {
//		System.out.println(tmp[i]);
//		}

//21
//		Calendar now = Calendar.getInstance();
//		
//		int year = now.get(Calendar.YEAR);
//		int month = now.get(Calendar.MONTH)+1;
//		int day = now.get(Calendar.DATE);
//		
//		System.out.println(year + "년 " + month +
//				"월 " + day +"일 ");