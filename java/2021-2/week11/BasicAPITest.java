package week11;

import java.util.*;

public class BasicAPITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String a = null;
		
//		for(int i = 0; i<args.length; i++) {
//			System.out.println("args[" + i + "]=" + args[i]);
//			a = args[i];}
		
		for(int i = 0; i<args.length; i++) {
			System.out.println("args[" + i + "]=" + args[i]);
			}

		StringTokenizer st = new StringTokenizer(args[0]," ");
		
		int ct = st.countTokens();
		System.out.println("모두 "+ ct +"개의 단어가 있습니다.");
		
		String [] tmp = new String[ct];
		
		while(st.hasMoreTokens()){
			for(int i = tmp.length-1; i>=0; i--) {
				String token = st.nextToken();
				tmp[i] = token;
			}	
			for(int i = 0; i<tmp.length ;i++) {
			System.out.println("tmp[" + i + "]=" + tmp[i]);
			}
		//	String token = st.nextToken();
		//	System.out.println(token);;
			
		}
		System.out.println("\n20215247_조아현");
	}

}
