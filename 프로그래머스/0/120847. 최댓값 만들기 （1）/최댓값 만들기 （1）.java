class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] * numbers[j] > answer && i != j) {
                    answer = numbers[i] * numbers[j];
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}