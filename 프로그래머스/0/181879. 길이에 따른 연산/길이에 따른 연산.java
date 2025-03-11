class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list.length >= 11) {
                sum += num_list[i];
            } else {
                mul *= num_list[i];
            }
        }
        
        if (num_list.length >= 11) {
                answer = sum;
            } else {
                answer = mul;
            }
        
        return answer;
    }
}