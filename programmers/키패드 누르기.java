class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
        
        for(int i = 0; i<numbers.length; i++){
            int num = numbers[i];
          
          //왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용합니다.
        	if(num==1||num==4||num==7) {
        		answer += "L";
        		left = num;
        	}
          
          //오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용합니다.
          else if(num==3||num==6||num==9) {
        		answer += "R";
        		right = num;
        	}
          
          //가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용합니다.
          else{
                if(num==0) num+=11;
                
                //((현재번호-누를번호/3))+((현재번호-누를번호%3))
                //?
                int r = Math.abs(num - right)%3 
                    + Math.abs(num - right)/3;
                int l =Math.abs(num - left)%3 
                    + Math.abs(num - left)/3;

                System.out.println(l+","+r);
                
                //만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용합니다.
                if(l == r){
                    if(hand.equals("right")){
                        answer += "R";
                        right = num;
                    }else{
                        answer += "L";
                        left = num;
                    }
                }
                else if(l > r){
                    answer += "R";
                    right = num;
                }
                else{
                    answer += "L";
                    left = num;
                }
            }
        }
        
        System.out.println(answer);
        return answer;
    }
}
