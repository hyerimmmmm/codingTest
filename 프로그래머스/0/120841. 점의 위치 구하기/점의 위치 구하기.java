class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        if (dot[0] > 0 && dot[1] > 0) { // 양양
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0) { // 음양
            answer = 2;
        } else if (dot[0] < 0 && dot[1] < 0) { // 음음
            answer = 3;
        } else if (dot[0] > 0 && dot[1] < 0) { // 양음
            answer = 4;
        }
        
        return answer;
    }
}