import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int count = 0;
        int count2 = 0;
        
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        
        int[] answer = new int[count];
        
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                answer[count2] = i;
                count2++;
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}