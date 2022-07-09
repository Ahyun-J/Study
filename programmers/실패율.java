//실패
import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        answer = new int[N];
        int size = stages.length;
        int [] fail = new int[N+1];
        int [] clear = new int[N+1];
        int allClear = 0;
        
        for(int i = 0; i < size; i++){
            for(int j = 0; j < N; j++){
                if(stages[i] > j){
                    clear[j]++;
                }
                if(stages[i] > N){
                    allClear = 1;
                }
                
            }
        }
        
        for(int i = 0; i < N; i++){
            int arrive = clear[i];
            int noClear = clear[i]-clear[i+1];
            double num = noClear/(double)arrive;
            
            if(noClear == 0){
                fail[i] = 0;
            }
            else{
                fail[i] = (int)Math.round(num*10);
            }
            
            answer[i] = i+1;
            //System.out.print(stages[i]+"-s ");
            //System.out.print(arrive+"-a ");
            //System.out.print(noClear+"-n ");
            //System.out.print(fail[i]+"-f ");
        }
        
        if(allClear == 1){
            fail[N-1] = 0;
        }
    
        int temp = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N-1; j++){
                if(fail[j] < fail[j+1]){
                    temp = fail[j];
                    fail[j]=fail[j+1];
                    fail[j+1]=temp; 
                    
                    int t2 = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = t2;
                      
                }
            }
        }
        
        return answer;
    }
}
