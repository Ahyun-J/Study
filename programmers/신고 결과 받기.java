class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int size = id_list.length;
        int[] answer = {};
        answer = new int[size];
        int[][] reportId = new int[size][size];
        
        for(int i=0; i<report.length; i++) {
            String[] s = report[i].split(" "); 
            // "a b"
            
            String a = s[0]; // a 신고자
            String b = s[1]; // b 신고대상자
            
            int aIndex = 0; // 신고자의 인덱스
            int bIndex = 0; // 신고대상자의 인덱스
            
            for(int j=0; j<size; j++) {
                if(a.equals(id_list[j])) {
                    aIndex = j;
                }
                if(b.equals(id_list[j])) {
                    bIndex = j;
                }
            }
            reportId[aIndex][bIndex] = 1;
        }
        
        for(int i=0; i<size; i++) {
            // 2차원 배열 돌면서 k번이상 신고받으면 
            int count = 0;
            
            for(int j=0; j<size; j++) {
                if(reportId[j][i] == 1) {
                    count++;
                }
            }
            
            if(count >= k) { 
                for(int j=0; j<size; j++) {
                    //신고한 사람한테 메일
                    if(reportId[j][i] == 1) {
                        answer[j]++;
                    }
                }
            }
        }
        
//         for(int i=0; i<answer.length; i++){
//             System.out.print(answer[i]+",");
//         }
//         System.out.println(); 
        return answer;
    }
}
