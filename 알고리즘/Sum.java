public class Sum {
	public static void main(String[] args) {
		
		int sum = 0;
		int n = 100;
		
		//1)
		sum = n*(n+1)/2;
		
		//2)
//		for(int i = 1; i <= n; i++) {
//			sum += i;
//		}
		
		//3)
//		for(int i = 1; i<=n; i++) {
//			for(int j = 1; j<=i; j++) {
//				sum += 1;
//			}
//		}
		
		System.out.println("sum = "+sum);
	}
}
