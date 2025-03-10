class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        
        for (int i = 0; i < sides.length; i++) {
            if (max < sides[i]) {
                max = sides[i];
            }
        }
        
        if (sides[0] + sides[1] + sides[2] - max > max) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        
        return answer;
    }
}