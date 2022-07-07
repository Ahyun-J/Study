class Solution {
    public int solution(String s) {
        int answer = 0;
        // String[] split = s.split("\\D+");
        // for(int i = 0; i<split.length;i++){
        //     System.out.print(split[i]);
        // }
        String word[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String number[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		
		// for 문을 수행하면서 문자열 변경 실시		
		for (int i=0; i<10; i++) { // 바꿔야하는 숫자 범위가 0 ~ 9 까지 
			s = s.replaceAll(word[i], number[i]); // 인풋으로 들어온 문자열에서 각 영단어 값을 숫자로 변경 실시
		}
	    answer = Integer.parseInt(s);

        return answer;
    }
}
